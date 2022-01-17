package de.evoila.eprofiler.dto.skill;

import java.util.Date;

public class CertificateDto {

    private String certificateTitle;
    private Date passingDate;

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle;
    }

    public Date getPassingDate() {
        return passingDate;
    }

    public void setPassingDate(Date passingDate) {
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
