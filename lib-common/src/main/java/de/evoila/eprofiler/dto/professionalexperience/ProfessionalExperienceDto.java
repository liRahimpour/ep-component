package de.evoila.eprofiler.dto.professionalexperience;

import de.evoila.eprofiler.dto.BaseDto;
import de.evoila.eprofiler.dto.common.*;
import de.evoila.eprofiler.dto.enums.Industry;

public class ProfessionalExperienceDto extends BaseDto {

    private String jobTitle;
    private String employmentStatus; //TODO: enum/constant
    private String description; //TODO:  opt.
    private String companyName;
    private Industry industry; //TODO: enum/constant
    private LocationDto location;
    private UrlDto website; //TODO:opt.
    private DurationDto duration;
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

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public UrlDto getWebsite() {
        return website;
    }

    public void setWebsite(UrlDto website) {
        this.website = website;
    }

    public DurationDto getDuration() {
        return duration;
    }

    public void setDuration(DurationDto duration) {
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
        return "ProfessionalExperienceDto{" +
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
