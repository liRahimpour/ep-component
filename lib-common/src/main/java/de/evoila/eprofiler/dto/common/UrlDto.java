package de.evoila.eprofiler.dto.common;

import de.evoila.eprofiler.dto.BaseDto;

public class UrlDto extends BaseDto {

    private String name;
    private String urlString;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String toString() {
        return "UrlDto{" +
                "name='" + name + '\'' +
                ", UrlDto='" + urlString + '\'' +
                '}';
    }
}
