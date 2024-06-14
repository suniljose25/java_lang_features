package sealedClasses.ex1.solution2.lib;

public abstract sealed class Vehicle permits Car, Truck {

    public void turnLeft() {
        System.out.println("Turns left");
    }

    public void turnRight() {
        System.out.println("Turns right");
    }

}
