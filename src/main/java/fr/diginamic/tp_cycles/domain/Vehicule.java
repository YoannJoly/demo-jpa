package fr.diginamic.tp_cycles.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Vehicule {

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "date_achat")
    private LocalDate dateAchat;

    @Column(name = "prix")
    private BigDecimal prixEuro;

    @Column(name = "isRent")
    private boolean isRent;

    public Vehicule(final String marque, final String modele, final LocalDate dateAchat, final BigDecimal prix, final boolean isRent) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.prixEuro = prix;
        this.isRent = isRent;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(final String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(final String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(final LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public BigDecimal getPrix() {
        return prixEuro;
    }

    public void setPrix(final BigDecimal prix) {
        this.prixEuro = prix;
    }

    public BigDecimal getPrixEuro() {
        return prixEuro;
    }

    public void setPrixEuro(final BigDecimal prixEuro) {
        this.prixEuro = prixEuro;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(final boolean rent) {
        isRent = rent;
    }




}
