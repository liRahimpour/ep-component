package de.evoila.backend.model.common;

import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    private String street;
    private String nr;
    private String postalCode;
    private Location city;

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

    public Location getCity() {
        return city;
    }

    public void setCity(Location city) {
        this.city = city;
    }
}
