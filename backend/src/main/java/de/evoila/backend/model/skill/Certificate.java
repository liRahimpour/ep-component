package de.evoila.backend.model.skill;

import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "certificate")
public class Certificate extends BaseEntity {

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
}
