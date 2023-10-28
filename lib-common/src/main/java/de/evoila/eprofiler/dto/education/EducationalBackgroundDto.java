package de.evoila.eprofiler.dto.education;

import de.evoila.eprofiler.dto.BaseDto;
import de.evoila.eprofiler.dto.common.DurationDto;
import de.evoila.eprofiler.dto.common.UniversityDto;
import de.evoila.eprofiler.dto.enums.Degree;


public class EducationalBackgroundDto extends BaseDto {
    private String courseOfStudy;
    private Degree degree; // TODO opt.
    private String description; //TODO  begrenzte anzahl chars opt.
    private UniversityDto university;
    private DurationDto duration;
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

    public UniversityDto getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDto university) {
        this.university = university;
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
        return "EducationalBackgroundDto{" +
                "courseOfStudy='" + courseOfStudy + '\'' +
                ", degree=" + degree +
                ", description='" + description + '\'' +
                ", universityDto=" + university +
                ", duration=" + duration +
                ", present=" + present +
                '}';
    }
}
