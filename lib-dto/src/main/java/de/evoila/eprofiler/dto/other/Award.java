package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.common.Url;

import java.util.Date;

public class Award {

    private Date year;
    private String awardName;
    private Url awardUrl;

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
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

    @Override
    public String toString() {
        return "Award{" +
                "year=" + year +
                ", awardName='" + awardName + '\'' +
                ", awardUrl=" + awardUrl +
                '}';
    }
}
