package com.example.a12902.designmode;

import android.content.Context;

/**
 * 用户接口和状态管理类
 */
public class LoginContext {
    //默认未登录状态
    private UserState state=new LogoutState();
    private static LoginContext instance;

    private LoginContext() {
    }

    public static LoginContext getInstance() {
        if (instance == null) {
            synchronized (LoginContext.class) {
                if (instance == null) {
                    instance = new LoginContext();
                }
            }
        }
        return instance;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public void forword(Context context) {
        state.forward(context);
    }

    public void comment(Context context) {
        state.comment(context);
    }
}
