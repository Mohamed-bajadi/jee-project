package org.example.ir.ws.dto;

import java.time.LocalDate;

public class TauxIrDto {
    private long id;
    private double salaireMax;
    private double salaireMin;
    private double pourcentage;
    private LocalDate dateMin;
    private LocalDate dateMax;
    private double cotisationPatronal;
    private double cotisationSalarial;

    public LocalDate getDateMax() {
        return dateMax;
    }

    public void setDateMax(LocalDate dateMax) {
        this.dateMax = dateMax;
    }

    public void setDateMin(LocalDate dateMin) {
        this.dateMin = dateMin;
    }

    public double getCotisationPatronal() {
        return cotisationPatronal;
    }

    public void setCotisationPatronal(double cotisationPatronal) {
        this.cotisationPatronal = cotisationPatronal;
    }

    public double getCotisationSalarial() {
        return cotisationSalarial;
    }

    public void setCotisationSalarial(double cotisationSalarial) {
        this.cotisationSalarial = cotisationSalarial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(double salaireMax) {
        this.salaireMax = salaireMax;
    }

    public double getSalaireMin() {
        return salaireMin;
    }

    public void setSalaireMin(double salaireMin) {
        this.salaireMin = salaireMin;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public LocalDate getDateMin() {
        return dateMin;
    }
}
