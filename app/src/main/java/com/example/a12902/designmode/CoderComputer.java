package com.example.a12902.designmode;

/**
 * 程序员计算机
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户名和密码验证就可以了");
    }
}
