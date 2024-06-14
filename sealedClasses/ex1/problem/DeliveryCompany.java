package sealedClasses.ex1.problem;

import sealedClasses.ex1.problem.lib.Driver;
import sealedClasses.ex1.problem.lib.Vehicle;
import sealedClasses.ex1.problem.lib.VehicleFactory;

public class DeliveryCompany {

    public static void main(String[] args) {

        Vehicle v = VehicleFactory.forMaxWeight(400);
        Driver driver = new Driver(v);
        driver.drive();

    }

}
