package day01.ex02;

import day01.package2.D;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        Taxi taxi = new Taxi();
        driver.drive(taxi);
        Horse horse = new Horse();
//        driver.drive(horse);
    }
}
