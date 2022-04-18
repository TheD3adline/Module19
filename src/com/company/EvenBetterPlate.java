package com.company;

public class EvenBetterPlate {

    private int diameter;

    public EvenBetterPlate(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "I am an even better plate";
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
