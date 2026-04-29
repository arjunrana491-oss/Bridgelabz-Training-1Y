package com.gla;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        // Add checkpoints using getter
        driver.getRouteHistory().addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 40, 30, 40)
        );

        driver.getRouteHistory().addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20, 15, 15)
        );

        driver.getRouteHistory().addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10, 20, 25)
        );

        driver.getRouteHistory().addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 50, 30, 45)
        );

        // Print result
        driver.printSummary();
    }
}