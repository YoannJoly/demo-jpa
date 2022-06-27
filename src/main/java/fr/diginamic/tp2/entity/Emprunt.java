package fr.diginamic.tp2.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private int id;

    @Column(name = "DATE_DEBUT", nullable = false)
    private LocalDateTime dateDebut;

    @Column(name = "DATE_FIN")
    private LocalDateTime dateFin;

    @Column(name = "DELAI", length = 10, nullable = false)
    private int delai;

    @ManyToOne
    @JoinColumn(name = "ID_Client", referencedColumnName = "id", insertable = false, updatable = false)
    private Client client;

    public Emprunt() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(final LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(final LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(final int delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai + ", client=" + client + "]";
    }
}
