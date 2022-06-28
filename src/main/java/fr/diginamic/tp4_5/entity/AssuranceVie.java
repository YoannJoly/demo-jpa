package fr.diginamic.tp4_5.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assurance_vie")
public class AssuranceVie extends Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "dateFin", nullable = false)
    private LocalDate dateFin;

    @Column(name = "taux", nullable = false)
    private double taux;

    public AssuranceVie(Compte compte, double taux) {
        this.setNumero(compte.getNumero());
        this.setSolde(compte.getSolde());
        this.dateFin = LocalDate.now().plusYears(1);
        this.taux = taux;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(final LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(final double taux) {
        this.taux = taux;
    }
}
