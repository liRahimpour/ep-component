package de.evoila.eprofiler.dto.skill;

import de.evoila.eprofiler.dto.BaseDto;

import java.time.LocalDate;

public class CertificateDto extends BaseDto {

    private String certificateTitle;
    private LocalDate passingDate;

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle;
    }

    public LocalDate getPassingDate() {
        return passingDate;
    }

    public void setPassingDate(LocalDate passingDate) {
        this.passingDate = passingDate;
    }

    @Override
    public String toString() {
        return "CertificateDto{" +
                "certificateTitle='" + certificateTitle + '\'' +
                ", passingDate=" + passingDate +
                '}';
    }
}
