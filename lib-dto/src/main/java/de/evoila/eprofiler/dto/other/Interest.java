package de.evoila.eprofiler.dto.other;

public class Interest {

    private String hobby;

    public String getInterest() {
        return hobby;
    }

    public void setInterest(String interest) {
        this.hobby = interest;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "hobby='" + hobby + '\'' +
                '}';
    }
}
