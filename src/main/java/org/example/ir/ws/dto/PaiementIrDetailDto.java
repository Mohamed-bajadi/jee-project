package org.example.ir.ws.dto;
import jakarta.persistence.ManyToOne;
import org.example.ir.bean.Employe;
import org.example.ir.bean.PaiementIr;
import org.example.ir.bean.TauxIr;

public class PaiementIrDetailDto {

    @ManyToOne
    private Employe employe;
    @ManyToOne
    private TauxIr tauxIr;
    @ManyToOne
    private PaiementIr paiementIr;
    private double salaireBrute;
    private double cotisationpatronel;
    private double cotoisationsalarial;
    private double salaireNet;

    private long id;


    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
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

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public PaiementIr getPaiementIr() {
        return paiementIr;
    }

    public void setPaiementIr(PaiementIr paiementIr) {
        this.paiementIr = paiementIr;
    }
}



