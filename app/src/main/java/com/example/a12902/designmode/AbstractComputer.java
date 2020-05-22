package com.example.a12902.designmode;

/**
 * 模板方法的抽象父类，用一个final方法封装了一系列流程
 */
public class AbstractComputer {
    protected void powerOn(){
        System.out.println("开启电源");
    }
    protected void checkHardware(){
        System.out.println("硬件检查");
    }
    protected void loadOs(){
        System.out.println("载入操作系统");
    }
    protected void login(){
        System.out.println("小白的计算机无验证，直接进入系统");
    }
    //final方法，封装一列列流程
    public final void startUp(){
        System.out.println("开机---start");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("关机---end");
    }
}
