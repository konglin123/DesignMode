package com.example.a12902.designmode;

/**
 * 抽象处理者
 */
public abstract class Leader {
    protected Leader nextHandler;

    //处理报账请求
    public void handleRequest(int money){
        if(limit()>=money){
            handle(money);
        }else{
            if(nextHandler!=null){
                nextHandler.handle(money);
            }
        }
    }

    //自身能批复的额度权限
    public abstract int limit();

    //处理报账行为
    public abstract void handle(int money);

}
