package de.evoila.eprofiler.dto.basicinfo;

import de.evoila.eprofiler.dto.common.Address;
import de.evoila.eprofiler.dto.common.Url;

public class Contacts {

    private String email; //TODO: validation
    String mobilePhone; //TODO:  (Phonevalidation?)
    private String tel; //TODO: (Phonevalidation?) opt.
    private Url website; //TODO:validation? opt.
    private Address address; //TODO: Adressv validation opt.

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Url getWebsite() {
        return website;
    }

    public void setWebsite(Url website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", tel='" + tel + '\'' +
                ", website=" + website +
                ", address=" + address +
                '}';
    }
}
