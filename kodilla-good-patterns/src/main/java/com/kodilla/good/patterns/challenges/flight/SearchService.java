package com.kodilla.good.patterns.challenges.flight;

public interface SearchService {
    public Flight searchFrom(City city);

    public FlightToDto searchTo(City city);

}
