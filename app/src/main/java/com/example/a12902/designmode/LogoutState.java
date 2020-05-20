package com.example.a12902.designmode;

import android.content.Context;

/**
 * 未登录状态不能转发和评论微博，跳转登录页面
 */
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        toLogin();
    }

    @Override
    public void comment(Context context) {
        toLogin();
    }

    public void toLogin(){
        //跳转登录页面
    }
}
