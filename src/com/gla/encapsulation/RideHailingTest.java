package com.gla.encapsulation;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(int vehicleId,String driverName,double ratePerKm) {
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    abstract double calculateFare(double distance);

    void getVehicleDetails() {
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Driver Name: "+driverName);
        System.out.println("Rate per Km: "+ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    Car(int id,String driver,double rate,String location) {
        super(id,driver,rate);
        this.location=location;
    }

    double calculateFare(double distance) {
        return getRatePerKm()*distance+50;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location=location;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    Bike(int id,String driver,double rate,String location) {
        super(id,driver,rate);
        this.location=location;
    }

    double calculateFare(double distance) {
        return getRatePerKm()*distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location=location;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    Auto(int id,String driver,double rate,String location) {
        super(id,driver,rate);
        this.location=location;
    }

    double calculateFare(double distance) {
        return getRatePerKm()*distance+20;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location=location;
    }
}

public class RideHailingTest {

    public static void calculateRideFare(Vehicle[] vehicles,double distance) {
        for(Vehicle v:vehicles) {
            v.getVehicleDetails();
            double fare=v.calculateFare(distance);
            System.out.println("Fare for "+distance+" km: "+fare);

            if(v instanceof GPS) {
                GPS g=(GPS)v;
                System.out.println("Current Location: "+g.getCurrentLocation());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];

        vehicles[0]=new Car(101,"Rahul",15,"Sector 14");
        vehicles[1]=new Bike(102,"Aman",8,"MG Road");
        vehicles[2]=new Auto(103,"Neeraj",10,"Bus Stand");

        calculateRideFare(vehicles,10);
    }
}