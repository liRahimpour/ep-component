package de.evoila.eprofiler.dto.common;

import de.evoila.eprofiler.dto.enums.Country;

public class LocationDto {

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
        return "LocationDto{" +
                "land=" + land +
                ", city='" + city + '\'' +
                '}';
    }
}
