package fr.diginamic.tp4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {

    @Column(name = "nom", length = 50, nullable = false)
    private String nom;

    public Banque() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }
}
