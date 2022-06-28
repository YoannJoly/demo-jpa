package fr.diginamic.tp4.entity;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "adresse")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "numero", length = 10, nullable = false)
    private int numero;

    @Column(name = "rue", length = 50, nullable = false)
    private String rue;

    @Column(name = "codePostal", length = 5, nullable = false)
    private int codePostal;

    @Column(name = "ville", length = 50, nullable = false)
    private String ville;

    public Adresse() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(final int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(final String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(final int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(final String ville) {
        this.ville = ville;
    }
}
