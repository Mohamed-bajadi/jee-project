package org.example.ir.bean;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


import jakarta.persistence.Id;
@Entity

public class Societe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ice;
    private String adresse;

    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
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


    public String getIce() {
        return ice;
    }
}