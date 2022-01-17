package de.evoila.eprofiler.dto.project;

import de.evoila.eprofiler.dto.common.Duration;
import de.evoila.eprofiler.dto.common.Location;
import de.evoila.eprofiler.dto.common.enums.Industry;

public class Project {

    private String projectTitle;
    private Duration duration;
    private Industry industry;
    private String employer;
    private Location location;
    private String role;
    private String description; //TODO: Opt.

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
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

    @Override
    public String toString() {
        return "Project{" +
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
