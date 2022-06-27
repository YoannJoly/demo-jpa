package fr.diginamic.tp2_3;

import fr.diginamic.tp2_3.entity.Emprunt;
import fr.diginamic.tp2_3.entity.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.logging.Level;

public class ConnexionJpa {

    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        findBookById(2);
        findEmpruntById(2);

    }

    public static void findBookById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Livre livre = entityManager.find(Livre.class, id);
        System.out.println(livre);

    }

    public static void findEmpruntById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Emprunt emprunt = entityManager.find(Emprunt.class, id);
        System.out.println(emprunt);

        List<Integer> nextId = entityManager.createQuery("SELECT idLiv FROM Compo WHERE idEmp=" + id).getResultList();

        System.out.println("\nLivres empruntés :");
        for (Integer integer : nextId) {
            findBookById(integer);
        }
    }
}
