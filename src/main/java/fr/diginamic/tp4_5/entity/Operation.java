package fr.diginamic.tp4_5.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "operation")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "montant", nullable = false)
    private double montant;

    @Column(name = "motif", length = 100, nullable = false)
    private String motif;

    public Operation() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(final LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(final double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(final String motif) {
        this.motif = motif;
    }
}
