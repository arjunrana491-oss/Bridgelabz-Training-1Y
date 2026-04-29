package com.gla;

public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        int delay = getActualDuration() - getExpectedDuration();

        if (isDelayed() && delay > 30) {
            return delay * 0.5;
        }
        return 0.0;
    }
}