package de.evoila.eprofiler.dto.common;

import java.util.Date;

public class DurationDto {

    private Date from;
    private Date to;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "DurationDto{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
