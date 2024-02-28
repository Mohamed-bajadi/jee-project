package org.example.ir.ws.dto;

public class SocieteDto {

    private long Id;
    private String ice;
    private String adresse;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
