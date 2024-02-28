package org.example.ir.bean;
import java.time.LocalDateTime;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;


@Entity
public class PaiementIr {
    @Id
    private Long id;
    @CreationTimestamp
    private LocalDate datePaiementIr;
    private double totalCotisationPatronal;
    private double totalCotisationSalarial;
    private String month;
    private String year;
    private double totalSalaireBrut;
    private double totalSalaireNet;
    private int annee;
    private int mois;
    @ManyToOne
    private  Societe societe;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDate getDatePaiementIr() {
        return datePaiementIr;
    }

    public void setDatePaiementIr(LocalDate datePaiementIr) {
        this.datePaiementIr = datePaiementIr;

    }




    public double getTotalCotisationPatronal() {
        return totalCotisationPatronal;
    }

    public void setTotalCotisationPatronal(double totalCotisationPatronal) {
        this.totalCotisationPatronal = totalCotisationPatronal;
    }

    public double getTotalCotisationSalarial() {
        return totalCotisationSalarial;
    }

    public void setTotalCotisationSalarial(double totalCotisationSalarial) {
        this.totalCotisationSalarial = totalCotisationSalarial;
    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getTotalSalaireBrut() {
        return totalSalaireBrut;
    }

    public void setTotalSalaireBrut(double totalSalaireBrut) {
        this.totalSalaireBrut = totalSalaireBrut;
    }

    public double getTotalSalaireNet() {
        return totalSalaireNet;
    }

    public void setTotalSalaireNet(double totalSalaireNet) {
        this.totalSalaireNet = totalSalaireNet;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;

    }
}
