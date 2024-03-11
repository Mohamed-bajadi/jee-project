package org.example.ir.ws.dto;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.example.ir.bean.Societe;

public class EmployeDto {
    private long id;
    private String firstname;
    private String lastname ;
    private Societe societe;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }
}
