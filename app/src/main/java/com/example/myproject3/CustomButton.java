package com.example.myproject3;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.button.MaterialButton;

public class CustomButton extends MaterialButton {
    private boolean isFocused = true;

    public CustomButton(@NonNull Context context) {
        super(context);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setIsFocused(boolean isFocused){
        this.isFocused = isFocused;
        changeBgDrawable();
    }

    private void changeBgDrawable(){
        setBackgroundResource(isFocused?R.drawable.shape_rect_focused:R.drawable.shape_rect_normal);
    }


}
