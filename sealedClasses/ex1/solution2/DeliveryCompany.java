package sealedClasses.ex1.solution2;

import sealedClasses.ex1.solution2.lib.Driver;
import sealedClasses.ex1.solution2.lib.Vehicle;
import sealedClasses.ex1.solution2.lib.VehicleFactory;

public class DeliveryCompany {

    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.forMaxWeight(400);
        Driver driver = new Driver(vehicle);
        driver.drive();

    }

}
