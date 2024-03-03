package org.example.ir.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Locale {
    @Id
    private long id;
    private String ref;
    private String addresse;
    private String libelle;
    @OneToOne
    private Renovable renovable;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Renovable getRenovable() {
        return renovable;
    }

    public void setRenovable(Renovable renovable) {
        this.renovable = renovable;
    }
}
