package fr.diginamic.tp7.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Additif {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "additif")
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
