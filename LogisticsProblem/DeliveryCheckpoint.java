package com.gla;

public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "DeliveryCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        if (isDelayed()) {
            return (getActualDuration() - getExpectedDuration()) * 2;
        }
        return 0;
    }
}
