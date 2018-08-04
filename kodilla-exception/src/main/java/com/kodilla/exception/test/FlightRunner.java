package com.kodilla.exception.test;

public class FlightRunner {
    static FlightFinder flightFinder = new FlightFinder();
    public static void main(String[] args) {
        Flight flight = new Flight("dep1", "arr1");
        Flight flight1 = new Flight("dep2", "arr2");
        Flight flight2 = new Flight("dep3", "arr3");

        portTesting(flight, "Port is in the map and is available");
        portTesting(flight1, "Port is in the map but isn't available");
        portTesting(flight2, "Port isn't in the map");

    }
    public static void portTesting(Flight flight, String headMessage) {
        System.out.println("----------TEST: " + headMessage +"----------");
        try {
            boolean isAirportAvailable = flightFinder.findFlight(flight);
            String result = (isAirportAvailable) ? "We are happy, you choose our airport: " + flight.getArrivalAirport() : "Sorry, airport: " + flight.getArrivalAirport() + " is not available now";
            System.out.println(result);
        } catch (RouteNotFoundException e) {
            System.out.println("Ups ther is some problem\n:" + e);
        } finally {
            System.out.println("We hope your travel is going well :)\n");
        }
    }
}
