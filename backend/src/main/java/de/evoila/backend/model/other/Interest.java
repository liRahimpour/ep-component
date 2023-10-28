package de.evoila.backend.model.other;

import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "interest")
public class Interest extends BaseEntity {

    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
