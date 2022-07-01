package fr.diginamic.tp_cycles.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "gyro")
public class Gyroroue extends Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "autonomie_minute")
    private int autonomieMinute;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private ClientVelo clientVelo;

    public Gyroroue(final String marque, final String modele, final LocalDate dateAchat, final BigDecimal prix, final boolean isRent, final int autonomieMinute, final ClientVelo clientVelo) {
        super(marque, modele, dateAchat, prix, isRent);
        this.autonomieMinute = autonomieMinute;
        this.clientVelo = clientVelo;
    }

    public int getAutonomieMinute() {
        return autonomieMinute;
    }

    public void setAutonomieMinute(final int autonomieMinute) {
        this.autonomieMinute = autonomieMinute;
    }
}
