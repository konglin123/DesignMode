package com.example.a12902.designmode;

import android.content.Context;
import android.widget.Toast;

/**
 * 已登陆状态下可以转发和评论微博
 */
public class LoginedState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context,"转发微博",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context,"评论微博",Toast.LENGTH_SHORT).show();
    }
}
