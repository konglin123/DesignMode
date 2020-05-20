package com.example.a12902.designmode;

import android.content.Context;

/**
 * 用户状态接口
 */
public interface UserState {
    //转发
    void forward(Context context);
    //评论
    void comment(Context context);
}
