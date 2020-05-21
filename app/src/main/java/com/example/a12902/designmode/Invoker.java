package com.example.a12902.designmode;

/**
 * 请求命令类
 */
public class Invoker {
    //持有一个命令类的引用
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }
    public void action(){
        command.excute();
    }
}
