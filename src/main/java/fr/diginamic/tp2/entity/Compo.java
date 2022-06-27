package fr.diginamic.tp2.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "COMPO")
public class Compo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private int id;

    @Column(name = "ID_LIV", length = 10, nullable = false)
    private int idLiv;

    @Column(name = "ID_EMP", length = 10, nullable = false)
    private int idEmp;


    public Compo() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getIdLiv() {
        return idLiv;
    }

    public void setIdLiv(final int idLiv) {
        this.idLiv = idLiv;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(final int idEmp) {
        this.idEmp = idEmp;
    }
}
