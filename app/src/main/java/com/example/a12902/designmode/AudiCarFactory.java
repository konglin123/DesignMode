package com.example.a12902.designmode;

/**
 * 具体工厂类
 */
public class AudiCarFactory extends AudiFactory {


    @Override
    public <T extends AudiCar> T creatAudiCar(Class<T> clz) {
        AudiCar audiCar=null;
        try {
            audiCar = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) audiCar;
    }
}
