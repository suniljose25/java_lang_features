package sealedClasses.ex1.solution1.lib;

public class Driver {

    private final Vehicle vehicle;

    public Driver(Object object) {
        if (object instanceof Vehicle) {
            this.vehicle = (Vehicle) object;
        } else {
            throw new IllegalArgumentException("Argument is not a Vehicle");
        }
    }

    public void drive() {
        vehicle.turnLeft();
        vehicle.turnRight();
    }
}
