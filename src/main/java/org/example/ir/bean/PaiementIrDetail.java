package org.example.ir.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
    private double cotisationPatronal;
    private double cotoisationSalarial;
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

    public double getCotisationPatronal() {
        return cotisationPatronal;
    }

    public void setCotisationPatronal(double cotisationPatronal) {
        this.cotisationPatronal = cotisationPatronal;
    }

    public double getCotoisationSalarial() {
        return cotoisationSalarial;
    }

    public void setCotoisationSalarial(double cotoisationSalarial) {
        this.cotoisationSalarial = cotoisationSalarial;
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

