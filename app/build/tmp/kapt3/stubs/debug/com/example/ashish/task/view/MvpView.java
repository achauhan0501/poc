package com.example.ashish.task.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ashish/task/view/MvpView;", "", "hideProgress", "", "setItems", "list", "Ljava/util/ArrayList;", "Lcom/example/ashish/task/model/RowData;", "heading", "", "showProgress", "app_debug"})
public abstract interface MvpView {
    
    public abstract void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.ashish.task.model.RowData> list, @org.jetbrains.annotations.NotNull()
    java.lang.String heading);
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
}