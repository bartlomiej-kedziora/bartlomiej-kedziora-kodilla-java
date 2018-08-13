package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightToDto {
    private List<City> fromDirectCities = new ArrayList<>();
    private List<City> viaCities = new ArrayList<>();

    public FlightToDto(List<City> fromDirectCities, List<City> viaCities) {
        this.fromDirectCities = fromDirectCities;
        this.viaCities = viaCities;
    }

    public List<City> getFromDirectCities() {
        return fromDirectCities;
    }

    public List<City> getViaCities() {
        return viaCities;
    }
}
