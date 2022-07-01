package fr.diginamic.tp_cycles.dal.jpa;


import fr.diginamic.tp_cycles.dal.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.logging.Level;

public class ObjectJpaImpl implements DAO<Object> {

    public void addObject(Object obj) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
