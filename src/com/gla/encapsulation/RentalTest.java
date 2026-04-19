package com.gla.encapsulation;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber,String type,double rentalRate) {
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate=rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String number,double rate,String policy) {
        super(number,"Car",rate);
        this.insurancePolicyNumber=policy;
    }

    double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    public double calculateInsurance() {
        return getRentalRate()*0.10;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: "+insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String number,double rate,String policy) {
        super(number,"Bike",rate);
        this.insurancePolicyNumber=policy;
    }

    double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: "+insurancePolicyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String number,double rate,String policy) {
        super(number,"Truck",rate);
        this.insurancePolicyNumber=policy;
    }

    double calculateRentalCost(int days) {
        return getRentalRate()*days*1.5;
    }

    public double calculateInsurance() {
        return getRentalRate()*0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: "+insurancePolicyNumber;
    }
}

public class RentalTest {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];

        vehicles[0]=new Car("DL01A1234",2000,"CAR123");
        vehicles[1]=new Bike("DL02B5678",800,"BIKE456");
        vehicles[2]=new Truck("DL03C9999",5000,"TRUCK789");

        int days=3;

        for(Vehicle v:vehicles) {
            double rent=v.calculateRentalCost(days);
            double insurance=0;

            if(v instanceof Insurable) {
                insurance=((Insurable)v).calculateInsurance();
            }

            System.out.println("Vehicle Number: "+v.getVehicleNumber());
            System.out.println("Type: "+v.getType());
            System.out.println("Rental Cost for "+days+" days: "+rent);
            System.out.println("Insurance Cost: "+insurance);

            if(v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails());
            }

            System.out.println();
        }
    }
}