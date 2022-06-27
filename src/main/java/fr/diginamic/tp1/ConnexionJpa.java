package fr.diginamic.tp1;

import fr.diginamic.tp1.entity.Region;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        showRegions();
        addRegion("Aquitaine");
        showRegions();
    }

    public static void showRegions() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        for (Region region : entityManager.createQuery("SELECT r FROM Region r", Region.class).getResultList()) {
            System.out.println(region);
        }

        entityManager.close();
        entityManagerFactory.close();
    }

    public static void addRegion(String nom) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Region region = new Region();
        region.setNom(nom);
        entityManager.persist(region);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}