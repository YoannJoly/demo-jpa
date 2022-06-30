package fr.diginamic.tp7.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Marque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "marque")
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
