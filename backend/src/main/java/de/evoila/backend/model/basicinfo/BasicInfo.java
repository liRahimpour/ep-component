package de.evoila.backend.model.basicinfo;

import com.sun.istack.NotNull;
import de.evoila.eprofiler.dto.enums.Sex;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

import static javax.persistence.EnumType.STRING;

@Entity
@Table(name = "basic_info")
public class BasicInfo extends BaseEntity {

    @NotNull
    private String surname;

    @NotNull
    private String evoilaJobTitleEn; //TODO:enum - braucht man Column notNull?

    @NotNull
    @Enumerated(STRING)
    private Sex sex; //TODO: braucht man Column notNull?

    private String maritalStatus; //TODO: enum opt.

    @NotNull
    private Date dayOfBirth; //TODO: opt. braucht man Column notNull?

    private String aboutMe;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEvoilaJobTitleEn() {
        return evoilaJobTitleEn;
    }

    public void setEvoilaJobTitleEn(String evoilaJobTitleEn) {
        this.evoilaJobTitleEn = evoilaJobTitleEn;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
