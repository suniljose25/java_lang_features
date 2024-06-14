package sealedClasses.ex1.problem.lib;

public class Driver {

    private final Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.turnLeft();
        vehicle.turnRight();
    }
}
