package com.gla.encapsulation;

interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    Patient(int patientId,String name,int age) {
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient ID: "+patientId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private String diagnosis;

    InPatient(int id,String name,int age,int days,double charge) {
        super(id,name,age);
        this.daysAdmitted=days;
        this.dailyCharge=charge;
    }

    double calculateBill() {
        return daysAdmitted*dailyCharge;
    }

    public void addRecord(String diagnosis) {
        this.diagnosis=diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: "+diagnosis);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;

    OutPatient(int id,String name,int age,double fee) {
        super(id,name,age);
        this.consultationFee=fee;
    }

    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String diagnosis) {
        this.diagnosis=diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: "+diagnosis);
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient[] patients=new Patient[2];

        InPatient p1=new InPatient(101,"Rahul",30,5,2000);
        p1.addRecord("Appendicitis Surgery");

        OutPatient p2=new OutPatient(102,"Neha",25,800);
        p2.addRecord("Viral Fever");

        patients[0]=p1;
        patients[1]=p2;

        for(Patient p:patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: "+p.calculateBill());

            if(p instanceof MedicalRecord) {
                MedicalRecord m=(MedicalRecord)p;
                m.viewRecords();
            }

            System.out.println();
        }
    }
}