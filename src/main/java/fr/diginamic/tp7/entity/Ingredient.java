package fr.diginamic.tp7.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "ingredient")
    private String libelle;

    public Ingredient(final String libelle) {
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
        return "Ingredient [id=" + id + ", libelle=" + libelle + "]";
    }
}
