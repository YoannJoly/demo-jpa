package fr.diginamic.tp_cycles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Gyropode extends Gyroroue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "taille_mini_cm")
    private int tailleMiniCm;

    public Gyropode(final String marque, final String modele, final LocalDate dateAchat, final int autonomieMinute, final ClientVelo clientVelo, final BigDecimal prix, final boolean isRent, final int tailleMiniCm) {
        super(marque, modele, dateAchat, prix, isRent, autonomieMinute, clientVelo);
        this.tailleMiniCm = tailleMiniCm;
    }

    public int getTailleMiniCm() {
        return tailleMiniCm;
    }

    public void setTailleMiniCm(final int tailleMiniCm) {
        this.tailleMiniCm = tailleMiniCm;
    }
}
