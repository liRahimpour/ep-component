package de.evoila.eprofiler.dto.professionalexperience;

import de.evoila.eprofiler.dto.common.Duration;
import de.evoila.eprofiler.dto.common.Location;
import de.evoila.eprofiler.dto.common.Url;
import de.evoila.eprofiler.dto.common.enums.Industry;

public class ProfessionalExperience {

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

    @Override
    public String toString() {
        return "ProfessionalExperience{" +
                "jobTitle='" + jobTitle + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", description='" + description + '\'' +
                ", companyName='" + companyName + '\'' +
                ", industry=" + industry +
                ", location=" + location +
                ", website=" + website +
                ", duration=" + duration +
                ", present=" + present +
                '}';
    }
}
