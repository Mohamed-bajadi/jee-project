package org.example.ir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class TauxIr {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double salaireMin;
    private double salaireMax;
    private double pourcentage;
    private LocalDate dateMin;
    private LocalDate dateMax;
    private double cotisationPatronal;
    private double cotisationSalarial;

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

    public double getSalaireMin() {
        return salaireMin;
    }

    public void setSalaireMin(double salaireMin) {
        this.salaireMin = salaireMin;
    }

    public double getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(double salaireMax) {
        this.salaireMax = salaireMax;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateMin() {
        return dateMin;
    }

    public void setDateMin(LocalDate dateMin) {
        this.dateMin = dateMin;
    }

    public LocalDate getDateMax() {
        return dateMax;
    }

    public void setDateMax(LocalDate dateMax) {
        this.dateMax = dateMax;
    }
}
