package com.example.ashish.task.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ashish/task/model/ResponseData;", "", "()V", "rows", "Ljava/util/ArrayList;", "Lcom/example/ashish/task/model/RowData;", "Lkotlin/collections/ArrayList;", "getRows", "()Ljava/util/ArrayList;", "setRows", "(Ljava/util/ArrayList;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
public final class ResponseData {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "rows")
    private java.util.ArrayList<com.example.ashish.task.model.RowData> rows;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.ashish.task.model.RowData> getRows() {
        return null;
    }
    
    public final void setRows(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.ashish.task.model.RowData> p0) {
    }
    
    public ResponseData() {
        super();
    }
}