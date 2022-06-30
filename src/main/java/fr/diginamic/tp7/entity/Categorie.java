package fr.diginamic.tp7.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
//@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "categorie")
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
