package org.example.ir.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class PaiementIrDetail {
    @Id
    private Long id;
    @ManyToOne
    private PaiementIr paiementIr;
    @ManyToOne
    private TauxIr tauxIr;
    @ManyToOne
    private Employe employe;
    private double salaireBrute;
    private double cotisationpatronel;
    private double cotoisationsalarial;
    private double salaireNet;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public PaiementIr getPaiementIr() {
        return paiementIr;
    }

    public void setPaiementIr(PaiementIr paiementIr) {
        this.paiementIr = paiementIr;
    }

    public TauxIr getTauxIr() {
        return tauxIr;
    }

    public void setTauxIr(TauxIr tauxIr) {
        this.tauxIr = tauxIr;
    }

    public double getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(double salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    public double getCotisationpatronel() {
        return cotisationpatronel;
    }

    public void setCotisationpatronel(double cotisationpatronel) {
        this.cotisationpatronel = cotisationpatronel;
    }

    public double getCotoisationsalarial() {
        return cotoisationsalarial;
    }

    public void setCotoisationsalarial(double cotoisationsalarial) {
        this.cotoisationsalarial = cotoisationsalarial;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}

