package de.evoila.eprofiler.dto.project;

import de.evoila.eprofiler.dto.common.DurationDto;
import de.evoila.eprofiler.dto.common.LocationDto;
import de.evoila.eprofiler.dto.common.enums.Industry;

public class ProjectDto {

    private String projectTitle;
    private DurationDto duration;
    private Industry industry;
    private String employer;
    private LocationDto location;
    private String role;
    private String description; //TODO: Opt.

    public DurationDto getDuration() {
        return duration;
    }

    public void setDuration(DurationDto duration) {
        this.duration = duration;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "projectTitle='" + projectTitle + '\'' +
                ", duration=" + duration +
                ", industry=" + industry +
                ", employer='" + employer + '\'' +
                ", location=" + location +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
