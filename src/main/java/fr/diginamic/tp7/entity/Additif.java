package fr.diginamic.tp7.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Additif {
    @Id
    private int id;
    private String libelle;

    public Additif(final String libelle) {
        this.id++;
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
        return "Additif [id=" + id + ", libelle=" + libelle + "]";
    }
}
