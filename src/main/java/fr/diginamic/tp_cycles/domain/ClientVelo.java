package fr.diginamic.tp_cycles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "client_velo")
public class ClientVelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tailleCm")
    private int tailleCm;

    @Column(name = "valeurPortefeuille")
    private int valeurPortefeuille;

    public ClientVelo(final String nom, final String prenom, final int tailleCm, final int valeurPortefeuille) {
        this.nom = nom;
        this.prenom = prenom;
        this.tailleCm = tailleCm;
        this.valeurPortefeuille = valeurPortefeuille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public int getTailleCm() {
        return tailleCm;
    }

    public void setTailleCm(final int tailleCm) {
        this.tailleCm = tailleCm;
    }

    public int getValeurPortefeuille() {
        return valeurPortefeuille;
    }

    public void setValeurPortefeuille(final int valeurPortefeuille) {
        this.valeurPortefeuille = valeurPortefeuille;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }


}
