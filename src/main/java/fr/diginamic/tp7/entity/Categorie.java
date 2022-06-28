package fr.diginamic.tp7.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
    @Id
    private int id;
    private String libelle;

    public Categorie(final String libelle) {
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
        return "Categorie [id=" + id + ", libelle=" + libelle + "]";
    }
}
