package fr.diginamic.tp7.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Marque implements Serializable {
    @Id
    private int id;
    private String libelle;

    public Marque(final String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Marque [id=" + id + ", libelle=" + libelle + "]";
    }
}
