package de.evoila.eprofiler.dto.common;

import java.time.LocalDate;

public class DurationDto {

    private LocalDate from;
    private LocalDate to;

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
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
