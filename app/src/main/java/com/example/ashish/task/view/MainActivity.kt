package com.example.ashish.task.view

import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.support.design.widget.Snackbar
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.ashish.task.MainApplication
import com.example.ashish.task.R
import com.example.ashish.task.adapter.ItemsAdapter
import com.example.ashish.task.model.RowData
import com.example.ashish.task.presenter.PresenterImpl
import com.example.ashish.task.receiver.ConnectionReceiver
import com.example.ashish.task.utils.AppConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MvpView,
        ConnectionReceiver.ConnectionReceiverListener {

    private var presenterImpl: PresenterImpl? = null
    var layoutManager: LinearLayoutManager? = null
    var list: ArrayList<RowData> = ArrayList()
    var title: String = ""
    var snackbar: Snackbar? = null
    var mConnectionReceiver: BroadcastReceiver? = null
    var itemsAdapter: ItemsAdapter? = null
    val HEADING_SIZE: Float = 20f
    val LIST_STATE_KEY: String = "key"
    var listState: Parcelable? = null


    override fun setItems(list: ArrayList<RowData>, heading: String) {
        this.list = list
        title = heading
        swipe_layout.isRefreshing = false
        initialise()
    }

    override fun showProgress() {
        progress_bar.visibility = View.VISIBLE
        rv.visibility = View.INVISIBLE
    }


    override fun hideProgress() {
        rv.visibility = View.VISIBLE
        progress_bar.visibility = View.INVISIBLE
    }


    override fun onResume() {
        MainApplication.getInstance().setConnectionListener(this)
        super.onResume()
    }

    override fun onDestroy() {
        unRegisterReceiver()
        presenterImpl?.detachView()
        super.onDestroy()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterImpl = PresenterImpl()
        presenterImpl?.attachedView(this)

        list = ArrayList()
        title = ""
        layoutManager = LinearLayoutManager(this)
        itemsAdapter = ItemsAdapter()
        rv.layoutManager = layoutManager
        rv.recycledViewPool.setMaxRecycledViews(0, 0)
        rv.setHasFixedSize(true)
        mConnectionReceiver = ConnectionReceiver()
        registerReceiver()

        // Check for previous state.
        if (savedInstanceState != null) {
            restorePreviousState(savedInstanceState)
        } else {
            checkConnection()
        }

        swipe_layout.setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener {
            if (ConnectionReceiver.isConnected()) {
                refresh()
                progress_bar.visibility = View.INVISIBLE
            } else {
                swipe_layout.isRefreshing = false
                swipe_layout.isEnabled = false
            }
        })
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        if (!isConnected)
            showNoInternetSnackBar()
        else {
            snackbar?.dismiss()
            swipe_layout.isEnabled = true
            if (list.isEmpty())
                presenterImpl?.onResume()
        }
    }



    fun registerReceiver() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            registerReceiver(mConnectionReceiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }

    fun unRegisterReceiver() = try {
        unregisterReceiver(mConnectionReceiver)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
    }

    fun restorePreviousState(savedInstanceState: Bundle) {
        list = savedInstanceState.getParcelableArrayList(AppConstants.SAVED_RECYCLER_VIEW_DATASET)
        title = savedInstanceState.getString(AppConstants.SAVED_RECYCLER_VIEW_HEADING)
        initialise()
    }

    fun refresh() {
        presenterImpl?.onResume()
    }


    fun initialise() {
        itemsAdapter?.addItems(list)
        rv.adapter = itemsAdapter
        val tv = TextView(applicationContext)
        // Create a LayoutParams for TextView
        val lp = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        tv.layoutParams = lp
        tv.gravity = Gravity.CENTER_HORIZONTAL
        tv.textSize = HEADING_SIZE
        tv.text = title
        top_view.addView(tv)

    }

    /**
     * Show No Internet Snackbar
     */
    fun showNoInternetSnackBar() {
        snackbar = Snackbar.make(ll_parent, getString(R.string.no_internet_results), Snackbar.LENGTH_INDEFINITE)
        snackbar?.setAction("RETRY", View.OnClickListener {
            if (ConnectionReceiver.isConnected()) {
                snackbar?.dismiss()
                presenterImpl?.onResume()

            } else {
                showNoInternetSnackBar()
            }
        })
        snackbar?.duration = Snackbar.LENGTH_INDEFINITE
        snackbar?.setActionTextColor(Color.WHITE)
        snackbar?.show()

    }

    /*
        *  Internet check
        * */
    private fun checkConnection() {
        val isConnected = ConnectionReceiver.isConnected()
        if (!isConnected) {
            showNoInternetSnackBar()

            val ll = presenterImpl?.getDataOffline() as ArrayList<RowData>
            if (ll.isNotEmpty()) {
                list = ll
                title = presenterImpl?.getTitle()!!
                initialise()
            }

        } else {
            presenterImpl?.onResume()
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelableArrayList(AppConstants.SAVED_RECYCLER_VIEW_DATASET, list)
        outState?.putString(AppConstants.SAVED_RECYCLER_VIEW_HEADING, title)
        super.onSaveInstanceState(outState)
    }
}
