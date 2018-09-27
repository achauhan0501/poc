package com.example.ashish.task.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J(\u0010\u0016\u001a\u00020\r2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/ashish/task/presenter/PresenterImpl;", "Lcom/example/ashish/task/presenter/Presenter;", "Lcom/example/ashish/task/view/MvpView;", "Lcom/example/ashish/task/model/LoaderListener;", "()V", "caller", "Lcom/example/ashish/task/model/InteractorImpl;", "getCaller", "()Lcom/example/ashish/task/model/InteractorImpl;", "setCaller", "(Lcom/example/ashish/task/model/InteractorImpl;)V", "mvpView", "attachedView", "", "view", "detachView", "getDataOffline", "Ljava/util/ArrayList;", "Lcom/example/ashish/task/model/RowData;", "Lkotlin/collections/ArrayList;", "getTitle", "", "onFinished", "list", "heading", "onResume", "app_debug"})
public final class PresenterImpl implements com.example.ashish.task.presenter.Presenter<com.example.ashish.task.view.MvpView>, com.example.ashish.task.model.LoaderListener {
    private com.example.ashish.task.view.MvpView mvpView;
    @org.jetbrains.annotations.NotNull()
    private com.example.ashish.task.model.InteractorImpl caller;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ashish.task.model.InteractorImpl getCaller() {
        return null;
    }
    
    public final void setCaller(@org.jetbrains.annotations.NotNull()
    com.example.ashish.task.model.InteractorImpl p0) {
    }
    
    @java.lang.Override()
    public void onFinished(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.ashish.task.model.RowData> list, @org.jetbrains.annotations.NotNull()
    java.lang.String heading) {
    }
    
    @java.lang.Override()
    public void attachedView(@org.jetbrains.annotations.NotNull()
    com.example.ashish.task.view.MvpView view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.ashish.task.model.RowData> getDataOffline() {
        return null;
    }
    
    public PresenterImpl() {
        super();
    }
}