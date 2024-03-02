package org.example.ir.ws.dto;

import org.example.ir.bean.Renovable;

import java.time.LocalDate;

public class TaxeLotissementDto {

    private Renovable renovable;
    private LocalDate dateDePresentation;
    private double surface;
    private double montantDeBase;
    private String ref;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Renovable getRenovable() {
        return renovable;
    }

    public void setRenovable(Renovable renovable) {
        this.renovable = renovable;
    }

    public LocalDate getDateDePresentation() {
        return dateDePresentation;
    }

    public void setDateDePresentation(LocalDate dateDePresentation) {
        this.dateDePresentation = dateDePresentation;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getMontantDeBase() {
        return montantDeBase;
    }

    public void setMontantDeBase(double montantDeBase) {
        this.montantDeBase = montantDeBase;
    }
}
