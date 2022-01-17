package de.evoila.eprofiler.dto.common;

import de.evoila.eprofiler.dto.common.enums.Country;

public class Location {

    private Country land;
    private String city;

    public Country getLand() {
        return land;
    }

    public void setLand(Country land) {
        this.land = land;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "land=" + land +
                ", city='" + city + '\'' +
                '}';
    }
}
