package com.company;

public class BetterBox<T> {

    private T objectInBox;

    public BetterBox(T objectInBox) {
        this.objectInBox = objectInBox;
    }

    public T getObjectInBox() {
        return objectInBox;
    }

    public void setObjectInBox(T objectInBox) {
        this.objectInBox = objectInBox;
    }
}
