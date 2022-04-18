package com.company;

public class Box {

    private int objectInBox;
    private Plate objectInBox2;

    public Box(int objectInBox) {
        this.objectInBox = objectInBox;
    }

    public Box(Plate plate) {
        this.objectInBox2 = plate;
    }

    public int getObjectInBox() {
        return objectInBox;
    }

    public Plate getObjectInBox2() {
        return objectInBox2;
    }

    public void setObjectInBox2(Plate objectInBox2) {
        this.objectInBox2 = objectInBox2;
    }

    public void setObjectInBox(int objectInBox) {
        this.objectInBox = objectInBox;
    }
}
