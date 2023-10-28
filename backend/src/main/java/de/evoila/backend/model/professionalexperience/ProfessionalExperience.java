package de.evoila.backend.model.professionalexperience;

import de.evoila.backend.model.common.Duration;
import de.evoila.backend.model.common.Location;
import de.evoila.backend.model.common.Url;
import de.evoila.eprofiler.dto.enums.Industry;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "professional_experience")
public class ProfessionalExperience extends BaseEntity {

    private String jobTitle;
    private String employmentStatus; //TODO: enum/constant
    private String description; //TODO:  opt.
    private String companyName;
    private Industry industry; //TODO: enum/constant
    private Location location;
    private Url website; //TODO:opt.
    private Duration duration;
    private Boolean present; //TODO:  default false

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Url getWebsite() {
        return website;
    }

    public void setWebsite(Url website) {
        this.website = website;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }
}
