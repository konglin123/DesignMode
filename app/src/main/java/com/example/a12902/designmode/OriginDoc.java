package com.example.a12902.designmode;

import android.util.Log;

public class OriginDoc implements Cloneable{
    private static final String TAG = "OriginDoc";
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    protected Object clone(){
        OriginDoc doc= null;
        try {
            doc = (OriginDoc) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void showDoc(){
        Log.e(TAG,"Text"+text);
    }
}
