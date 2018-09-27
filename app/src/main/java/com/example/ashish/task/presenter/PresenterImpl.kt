package com.example.ashish.task.presenter

import com.example.ashish.task.model.DataConstants
import com.example.ashish.task.model.InteractorImpl
import com.example.ashish.task.model.LoaderListener
import com.example.ashish.task.model.RowData
import com.example.ashish.task.view.MvpView

class PresenterImpl : Presenter<MvpView>, LoaderListener {


    private var mvpView: MvpView? = null

    var caller: InteractorImpl = InteractorImpl()


    override fun onFinished(list: ArrayList<RowData>, heading: String) {
        mvpView?.setItems(list, heading)
        mvpView?.hideProgress()
    }


    override fun attachedView(view: MvpView) {
        if (view == null)
            throw IllegalArgumentException("You can't set a null view")

        mvpView = view
    }

    override fun detachView() {
        mvpView = null
    }

    override fun onResume() {
        mvpView?.showProgress()
        caller.loadItems(this)
    }

    // used to get title on offline mode.
    fun getTitle() : String{
        return DataConstants.title
    }

    // used to get list in offline mode.
    fun getDataOffline(): ArrayList<RowData> {
        return DataConstants.row_list
    }


}