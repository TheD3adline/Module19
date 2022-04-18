package com.company;

public class Main {

    public static void main(String[] args) {

        Plate plate1 = new Plate(20);

        Box box1 = new Box(plate1);

        System.out.println(box1.getObjectInBox());

        System.out.println("-------------------------------------------------");

        BetterPlate plate2 = new BetterPlate(30);

        BetterBox<BetterPlate> box2 = new BetterBox<BetterPlate>(plate2);

        System.out.println(box2.getObjectInBox());

        System.out.println("-------------------------------------------------");

        EvenBetterPlate plate3 = new EvenBetterPlate(40);

        EvenBetterBox<String> box3 = new EvenBetterBox<String>("Hello there!");

        System.out.println(box3.getObjectInBox());

        System.out.println("-------------------------------------------------");

        Texter texter1 = new Texter();

        texter1.printObject("Hello, this is a test!");
        texter1.printObject(24);

        System.out.println("-------------------------------------------------");

        BetterTexter texter2 = new BetterTexter();

        texter2.printObject("Hello, this is a better test!");
        texter2.printObject(69);
    }
}
