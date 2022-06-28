package fr.diginamic.tp4_5.entity;

import javax.persistence.*;

@Entity
@Table(name = "virement")
public class Virement extends Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "beneficiaire", length = 50, nullable = false)
    private String beneficiaire;

    public Virement(Operation operation, String beneficiaire) {
        this.setDate(operation.getDate());
        this.setMontant(operation.getMontant());
        this.setMotif(operation.getMotif());
        this.beneficiaire = beneficiaire;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(final String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
