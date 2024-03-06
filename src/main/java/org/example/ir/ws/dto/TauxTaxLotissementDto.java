package org.example.ir.ws.dto;

import java.time.LocalDateTime;

public class TauxTaxLotissementDto {
    private Long id;
    private double montantParMetreCarre;
    private LocalDateTime dateAppMax;
    private LocalDateTime dateAppMin;
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
