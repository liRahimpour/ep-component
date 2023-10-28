package de.evoila.eprofiler.dto.common;

import de.evoila.eprofiler.dto.BaseDto;

public class AddressDto extends BaseDto {

    private String street;
    private String nr;
    private String postalCode;
    private LocationDto city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public LocationDto getCity() {
        return city;
    }

    public void setCity(LocationDto city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "street='" + street + '\'' +
                ", nr='" + nr + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city=" + city +
                '}';
    }
}
