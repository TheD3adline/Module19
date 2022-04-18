package com.company;

public class BetterPlate {

    private int diameter;

    public BetterPlate(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "I am a better plate";
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
