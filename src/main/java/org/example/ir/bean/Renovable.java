package org.example.ir.bean;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Renovable {
    @Id
    private Long Id;
    private String cim;
    private String nom;
    private String prenom;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
