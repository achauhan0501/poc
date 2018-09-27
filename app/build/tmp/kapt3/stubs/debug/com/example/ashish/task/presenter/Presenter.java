package com.example.ashish.task.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&\u00a8\u0006\t"}, d2 = {"Lcom/example/ashish/task/presenter/Presenter;", "V", "", "attachedView", "", "view", "(Ljava/lang/Object;)V", "detachView", "onResume", "app_debug"})
public abstract interface Presenter<V extends java.lang.Object> {
    
    public abstract void attachedView(V view);
    
    public abstract void detachView();
    
    public abstract void onResume();
}