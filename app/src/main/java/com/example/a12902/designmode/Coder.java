package com.example.a12902.designmode;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者（这里的观察者是指程序员们，被观察者是指被程序员订阅的技术周刊）
 */
public class Coder implements Observer{
    public String name;

    public Coder(String name){
        this.name=name;
    }

    @Override
    public void update(Observable observable, Object o) {
      System.out.println("hi,"+name+",技术周刊内容更新啦，最新内容是"+o);
    }
}
