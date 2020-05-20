package com.example.a12902.designmode;

/**
 * 策略模式
 */
public class TranficalCalculator {
    private static TranficalCalculator ins;
    private CalculateStrategy calculateStrategy;
    private TranficalCalculator(){

    }

    public static TranficalCalculator getIns(){
        if (ins==null){
            synchronized (TranficalCalculator.class){
                if(ins==null){
                    ins=new TranficalCalculator();
                }
            }
        }
        return ins;
    }


    public void setStrategy(CalculateStrategy calculateStrategy){
        this.calculateStrategy=calculateStrategy;
    }

    public int calculatePrice(int km){
       return calculateStrategy.calculatePrice(km);
    }


}
