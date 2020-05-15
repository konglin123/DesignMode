package com.example.a12902.designmode;

/**
 * 抽象工厂类
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T creatAudiCar(Class<T> clz);
}
