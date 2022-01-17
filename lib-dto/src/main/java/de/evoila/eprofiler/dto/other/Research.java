package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.common.Url;

import java.util.Date;

public class Research {

    private String researchTitle;
    private String publisher;
    private Url researchUrl;
    private Date date;
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

    public Url getResearchUrl() {
        return researchUrl;
    }

    public void setResearchUrl(Url researchUrl) {
        this.researchUrl = researchUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
        return "Research{" +
                "researchTitle='" + researchTitle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", researchUrl=" + researchUrl +
                ", date=" + date +
                ", Description='" + description + '\'' +
                '}';
    }
}
