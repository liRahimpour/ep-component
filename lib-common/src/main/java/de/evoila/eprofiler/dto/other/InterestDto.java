package de.evoila.eprofiler.dto.other;

import de.evoila.eprofiler.dto.BaseDto;

public class InterestDto extends BaseDto {

    private String hobby;

    public String getInterest() {
        return hobby;
    }

    public void setInterest(String interest) {
        this.hobby = interest;
    }

    @Override
    public String toString() {
        return "InterestDto{" +
                "hobby='" + hobby + '\'' +
                '}';
    }
}
