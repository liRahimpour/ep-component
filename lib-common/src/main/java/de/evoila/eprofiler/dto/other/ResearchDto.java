package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.BaseDto;
import de.evoila.eprofiler.dto.common.UrlDto;

import java.time.LocalDate;

public class ResearchDto extends BaseDto {

    private String researchTitle;
    private String publisher;
    private UrlDto researchUrl;
    private LocalDate date;
    private String description;

    public String getResearchTitle() {
        return researchTitle;
    }

    public void setResearchTitle(String researchTitle) {
        this.researchTitle = researchTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public UrlDto getResearchUrl() {
        return researchUrl;
    }

    public void setResearchUrl(UrlDto researchUrl) {
        this.researchUrl = researchUrl;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ResearchDto{" +
                "researchTitle='" + researchTitle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", researchUrl=" + researchUrl +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
