package de.evoila.eprofiler.dto.basicinfo;

import de.evoila.eprofiler.dto.common.Url;

public class SocialNetwork {
    //TODO:alles opt.
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

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "socialNetworkName='" + socialNetworkName + '\'' +
                ", socialNetworkId='" + socialNetworkId + '\'' +
                ", socialNetworkProfileUrl=" + socialNetworkProfileUrl +
                '}';
    }
}
