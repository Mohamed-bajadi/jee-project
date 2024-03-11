package org.example.ir.bean;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class EmployeSalaireHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate moisDepart ;
    private LocalDate moisFin;
    private LocalDate anneeDepart;
    private LocalDate anneeFin;
    private LocalDate salaireBrut;
    @ManyToOne
    private Societe societe;
    @OneToOne
    private Employe employe;
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getMoisDepart() {
        return moisDepart;
    }

    public void setMoisDepart(LocalDate moisDepart) {
        this.moisDepart = moisDepart;
    }

    public LocalDate getMoisFin() {
        return moisFin;
    }

    public void setMoisFin(LocalDate moisFin) {
        this.moisFin = moisFin;
    }

    public LocalDate getAnneeDepart() {
        return anneeDepart;
    }

    public void setAnneeDepart(LocalDate anneeDepart) {
        this.anneeDepart = anneeDepart;
    }

    public LocalDate getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(LocalDate anneeFin) {
        this.anneeFin = anneeFin;
    }

    public LocalDate getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(LocalDate salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
