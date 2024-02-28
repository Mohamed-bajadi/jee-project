package org.example.ir.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class TauxIr {

    @Id
    private Long id;
    private double salaireMin;
    private double salaireMax;
    private double pourcentage;
    private LocalDate dateMin;
    private LocalDate dateMax;


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
