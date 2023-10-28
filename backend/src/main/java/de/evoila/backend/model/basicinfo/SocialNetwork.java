package de.evoila.backend.model.basicinfo;

import de.evoila.backend.model.common.Url;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "social_network")
public class SocialNetwork extends BaseEntity {

    private String socialNetworkName; // TODO:enum opt.
    private String socialNetworkId; //TODO:irgendwelche validation je nach network opt.
    private Url socialNetworkProfileUrl; //TODO:URL validation opt.
    //qrCode; //TODO:bild opt. irgendwie das build hochladen


    public String getSocialNetworkName() {
        return socialNetworkName;
    }

    public void setSocialNetworkName(String socialNetworkName) {
        this.socialNetworkName = socialNetworkName;
    }

    public String getSocialNetworkId() {
        return socialNetworkId;
    }

    public void setSocialNetworkId(String socialNetworkId) {
        this.socialNetworkId = socialNetworkId;
    }

    public Url getSocialNetworkProfileUrl() {
        return socialNetworkProfileUrl;
    }

    public void setSocialNetworkProfileUrl(Url socialNetworkProfileUrl) {
        this.socialNetworkProfileUrl = socialNetworkProfileUrl;
    }
}
