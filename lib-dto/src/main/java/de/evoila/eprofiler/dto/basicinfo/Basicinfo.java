package de.evoila.eprofiler.dto.basicinfo;

import de.evoila.eprofiler.dto.common.enums.Sex;

import java.util.Date;

public class Basicinfo {

    private String firstname;
    private String surname;
    private String evoilaJobTitleEn; //TODO:enum
    private Sex sex;
    private String maritalStatus; //TODO: enum opt.
    private Date birthDate; //TODO: opt.
    private String aboutMe;  //TODO: *(Validation bestimmte anzahl an Charakter)*/a

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString() {
        return "Basicinfo{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", evoilaJobTitleEn='" + evoilaJobTitleEn + '\'' +
                ", sex=" + sex +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", birthDate=" + birthDate +
                ", aboutMe='" + aboutMe + '\'' +
                '}';
    }
}
