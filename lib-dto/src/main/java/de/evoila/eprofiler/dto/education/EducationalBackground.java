package de.evoila.eprofiler.dto.education;

import de.evoila.eprofiler.dto.common.Duration;
import de.evoila.eprofiler.dto.common.University;
import de.evoila.eprofiler.dto.common.enums.Degree;

public class EducationalBackground {
    private String courseOfStudy;
    private Degree degree; // TODO opt.
    private String description; //TODO  begrenzte anzahl chars opt.
    private University university;
    private Duration duration;
    private Boolean present; //TODO default false

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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
        return "EducationalBackground{" +
                "courseOfStudy='" + courseOfStudy + '\'' +
                ", degree=" + degree +
                ", description='" + description + '\'' +
                ", university=" + university +
                ", duration=" + duration +
                ", Present=" + present +
                '}';
    }
}
