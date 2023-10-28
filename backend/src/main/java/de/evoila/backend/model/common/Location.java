package de.evoila.backend.model.common;

import de.evoila.eprofiler.dto.enums.Country;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location extends BaseEntity {

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
}
