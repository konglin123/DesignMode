package com.example.a12902.designmode;

/**
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    //持有一个具体处理逻辑的类引用,调用它的方法
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void excute() {
        if(receiver!=null){
            receiver.action();
        }
    }
}
