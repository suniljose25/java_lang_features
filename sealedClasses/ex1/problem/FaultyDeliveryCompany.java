package sealedClasses.ex1.problem;

import sealedClasses.ex1.problem.lib.Driver;
import sealedClasses.ex1.problem.lib.Vehicle;

public class FaultyDeliveryCompany {

    public static void main(String[] args) {

        Vehicle v = new Train();

        // This is not supposed to happen.
        Driver driver = new Driver(v);

        // A train does not turn left or right!!!
        driver.drive();

    }

}

class Train extends Vehicle {}