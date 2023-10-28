package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.BaseDto;
import de.evoila.eprofiler.dto.common.UrlDto;

import java.time.LocalDate;

public class AwardDto extends BaseDto {

    private LocalDate year;
    private String awardName;
    private UrlDto awardUrl;

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
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
