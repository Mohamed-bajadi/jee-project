package org.example.ir.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TauxTaxLotissement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double montantParMetreCarre;
    private LocalDateTime dateAppMax;
    private LocalDateTime dateAppMin;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontantParMetreCarre() {
        return montantParMetreCarre;
    }

    public void setMontantParMetreCarre(double montantParMetreCarre) {
        this.montantParMetreCarre = montantParMetreCarre;
    }

    public LocalDateTime getDateAppMax() {
        return dateAppMax;
    }

    public void setDateAppMax(LocalDateTime dateAppMax) {
        this.dateAppMax = dateAppMax;
    }

    public LocalDateTime getDateAppMin() {
        return dateAppMin;
    }

    public void setDateAppMin(LocalDateTime dateAppMin) {
        this.dateAppMin = dateAppMin;
    }
}
