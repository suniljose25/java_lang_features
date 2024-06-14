package sealedClasses.ex1.problem.lib;

public class VehicleFactory {

    public static Vehicle forMaxWeight(int weight) {
        if (weight < 500) {
            return new Car();
        }
        return new Truck();
    }
}
