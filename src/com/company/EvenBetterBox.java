package com.company;

public class EvenBetterBox<Y> {

    private Y objectInBox;

    public EvenBetterBox(Y objectInBox) {
        this.objectInBox = objectInBox;
    }

    public Y getObjectInBox() {
        return objectInBox;
    }

    public void setObjectInBox(Y objectInBox) {
        this.objectInBox = objectInBox;
    }
}
