package fr.diginamic.tp_cycles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "velo")
public class Velo extends Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "systemeVitesse")
    private String systemeVitesse;

    @Column(name = "nbrVitesse")
    private int nbrVitesse;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private ClientVelo clientVelo;


    public Velo(final String marque, final String modele, final LocalDate dateAchat, final BigDecimal prix, final boolean isRent, final String systemeVitesse, final int nbrVitesse, final ClientVelo clientVelo) {
        super(marque, modele, dateAchat, prix, isRent);
        this.systemeVitesse = systemeVitesse;
        this.nbrVitesse = nbrVitesse;
        this.clientVelo = clientVelo;
    }

    public String getSystemeVitesse() {
        return systemeVitesse;
    }

    public void setSystemeVitesse(final String systemeVitesse) {
        this.systemeVitesse = systemeVitesse;
    }

    public int getNbrVitesse() {
        return nbrVitesse;
    }

    public void setNbrVitesse(final int nbrVitesse) {
        this.nbrVitesse = nbrVitesse;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }


}