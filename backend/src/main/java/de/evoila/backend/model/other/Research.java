package de.evoila.backend.model.other;

import de.evoila.backend.model.common.Url;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "research")
public class Research extends BaseEntity {

    private String researchTitle;
    private String publisher;
    private Url researchUrl;
    private LocalDate date;
    private String description;

    public String getResearchTitle() {
        return researchTitle;
    }

    public void setResearchTitle(String researchTitle) {
        this.researchTitle = researchTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Url getResearchUrl() {
        return researchUrl;
    }

    public void setResearchUrl(Url researchUrl) {
        this.researchUrl = researchUrl;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
