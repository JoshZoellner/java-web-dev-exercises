package org.launchcode.java.demos.lsn5unittesting.test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;


public class CarTest {

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10,
                test_car.getGasTankLevel(),
                .001);
    }

    //Version of testInitialGasTank() using assertFalse().
//    public void testInitialGasTank() {
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }

    //Version of testInitialGasTank() using assertTrue().
//    public void testInitialGasTank() {
//        assertTrue(test_car.getGasTankLevel() == 10);
//    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),.001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {

    double maxDistance = test_car.getMilesPerGallon() * test_car.getGasTankLevel();

        test_car.drive(maxDistance);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }


    //TODO: can't have more gas than tank size, expect an exception

//    @Test(expected = IllegalArgumentException.class)
//    public void testGasOverfillException() {
//
//    test_car.addGas(5);
//    fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank.");
//
//        public void setGasTankLevel(double gasTankLevel) {
//            if (gasTankLevel > this.getGasTankSize()) {
//                throw new IllegalArgumentException("Can't exceed tank size");
//            }
//            this.gasTankLevel = gasTankLevel;
//        }
//    }


}