package sealedClasses.ex1.solution1;

import sealedClasses.ex1.solution1.lib.Driver;
import sealedClasses.ex1.solution1.lib.VehicleFactory;

public class DeliveryCompany {

    public static void main(String[] args) {

        Object vehicle = VehicleFactory.forMaxWeight(400);
        Driver driver = new Driver(vehicle);
        driver.drive();

    }

}
