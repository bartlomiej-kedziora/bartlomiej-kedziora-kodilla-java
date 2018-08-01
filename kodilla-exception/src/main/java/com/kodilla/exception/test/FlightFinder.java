package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsAvailability = new HashMap<>();
        airportsAvailability.put("arr1",true);
        airportsAvailability.put("arr2", false);

        if(!airportsAvailability.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport() + " is not available in our area!");
        }
        return airportsAvailability.get(flight.getArrivalAirport());

    }
}
