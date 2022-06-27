package fr.diginamic.tp4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "solde", length = 10, nullable = false)
    private double solde;

    public Compte() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(final String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(final double solde) {
        this.solde = solde;
    }
}
