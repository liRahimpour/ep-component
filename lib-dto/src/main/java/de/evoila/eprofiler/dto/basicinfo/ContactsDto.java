package de.evoila.eprofiler.dto.basicinfo;

import de.evoila.eprofiler.dto.common.AddressDto;
import de.evoila.eprofiler.dto.common.UrlDto;

public class ContactsDto {

    private String email; //TODO: validation
    String mobilePhone; //TODO:  (Phonevalidation?)
    private String tel; //TODO: (Phonevalidation?) opt.
    private UrlDto website; //TODO:validation? opt.
    private AddressDto address; //TODO: Adressv validation opt.

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

    public UrlDto getWebsite() {
        return website;
    }

    public void setWebsite(UrlDto website) {
        this.website = website;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactsDto{" +
                "email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", tel='" + tel + '\'' +
                ", website=" + website +
                ", address=" + address +
                '}';
    }
}
