package fr.diginamic.tp7.dal.jpa;

import fr.diginamic.tp7.dal.DAO;
import fr.diginamic.tp7.entity.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.logging.Level;

public class ProduitJpaImpl implements DAO<Produit> {

    public void addProduit(Produit produit) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(produit);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
