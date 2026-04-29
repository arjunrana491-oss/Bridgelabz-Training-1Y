package com.gla;

public abstract class Checkpoint {

    private String checkpointId;
    private String locationName;
    private double distanceFromLast;
    private int expectedDuration;
    private int actualDuration;

    // Constructor
    public Checkpoint(String checkpointId, String locationName, double distanceFromLast,
                      int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    // Getter methods (important for access)
    public String getCheckpointId() {
        return checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getDistanceFromLast() {
        return distanceFromLast;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public int getActualDuration() {
        return actualDuration;
    }

    // Common method
    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    // Abstract methods
    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}