package de.evoila.backend.model.other;

import de.evoila.backend.model.common.Url;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "award")
public class Award extends BaseEntity {

    private LocalDate year;
    private String awardName;
    private Url awardUrl;

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Url getAwardUrl() {
        return awardUrl;
    }

    public void setAwardUrl(Url awardUrl) {
        this.awardUrl = awardUrl;
    }
}
