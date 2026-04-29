package com.gla;

public class Driver {

    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    // Constructor
    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    // Getter (optional but useful)
    public RouteLinkedList<Checkpoint> getRouteHistory() {
        return routeHistory;
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        if (routeHistory == null) {
            System.out.println("No route data available.");
            return;
        }

        routeHistory.printRoute();

        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        boolean isValid = routeHistory.checkCritical();

        System.out.println("Critical Route Check: " +
                (isValid ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}