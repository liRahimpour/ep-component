package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.common.UrlDto;

import java.util.Date;

public class AwardDto {

    private Date year;
    private String awardName;
    private UrlDto awardUrl;

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

    public UrlDto getAwardUrl() {
        return awardUrl;
    }

    public void setAwardUrl(UrlDto awardUrl) {
        this.awardUrl = awardUrl;
    }

    @Override
    public String toString() {
        return "AwardDto{" +
                "year=" + year +
                ", awardName='" + awardName + '\'' +
                ", awardUrl=" + awardUrl +
                '}';
    }
}
