package fr.diginamic.tp4_5.entity;

import javax.persistence.*;

@Entity
@Table(name = "livret_a")
public class LivretA extends Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "taux", nullable = false)
    private double taux;

    public LivretA(Compte compte, double taux) {
        this.setNumero(compte.getNumero());
        this.setSolde(compte.getSolde());
        this.taux = taux;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(final double taux) {
        this.taux = taux;
    }
}
