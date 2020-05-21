package com.example.a12902.designmode;

import java.util.Observable;

public class TechBook extends Observable {
    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
