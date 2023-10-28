package de.evoila.eprofiler.dto.common;

public class UniversityDto {

    private String universityName;
    private LocationDto location;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UniversityDto{" +
                "universityName='" + universityName + '\'' +
                ", location=" + location +
                '}';
    }
}
