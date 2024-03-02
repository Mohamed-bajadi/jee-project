package org.example.ir.bean;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

public class TaxeLotiessment {
    @OneToOne
    private Renovable renovable;
    private LocalDate dateDePresentation;
    private double surface;
    private double montantDeBase;
    private String ref;
    @Id
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
