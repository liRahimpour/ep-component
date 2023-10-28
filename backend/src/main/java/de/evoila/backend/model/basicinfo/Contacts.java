package de.evoila.backend.model.basicinfo;

import de.evoila.backend.model.common.Address;
import de.evoila.backend.model.common.Url;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "contacts")
public class Contacts extends BaseEntity {

    private String email; //TODO: validation

    private String mobilePhone; //TODO:  (Phonevalidation?)
    private String tel; //TODO: (Phonevalidation?) opt.
    @OneToMany
    private List<Url> website; //TODO:validation? opt.
    @OneToOne
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

    public List<Url> getWebsite() {
        return website;
    }

    public void setWebsite(List<Url> website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
