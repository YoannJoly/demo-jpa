package fr.diginamic.tp1.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private int id;

    @Column(name = "nom", length = 30, nullable = false)
    private String nom;

    public Region() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Region [id=" + id + ", nom=" + nom + "]";
    }
}
