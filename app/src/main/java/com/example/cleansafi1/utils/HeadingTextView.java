package com.example.cleansafi1.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;



public class HeadingTextView extends TextView {

    public HeadingTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setType(context);
    }

    public HeadingTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context);
    }

    public HeadingTextView(Context context) {
        super(context);
        setType(context);
    }

    private void setType(Context context){
        this.setTypeface(AppGlobals.typefaceBold);
    }
}
