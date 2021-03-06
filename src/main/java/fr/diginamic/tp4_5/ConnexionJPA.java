package fr.diginamic.tp4_5;

import fr.diginamic.tp4_5.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;

public class ConnexionJPA {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        // Création d'un client
        Clients client = new Clients();
        client.setNom("Dupont");
        client.setPrenom("Jean");
        client.setDateNaissance(LocalDate.of(1980, 1, 1));

        // Création d'un compte
        Compte compte = new Compte();
        compte.setNumero("123456789");
        compte.setSolde(1000);

        // Création d'une banque
        Banque banque = new Banque();
        banque.setNom("BNP");

        // Création d'une opération
        Operation operation = new Operation();
        operation.setDate(LocalDateTime.now());
        operation.setMontant(100);
        operation.setMotif("Retrait");

        //Creation d'une adresse
        Adresse adresse = new Adresse();
        adresse.setNumero(1);
        adresse.setRue("rue de la paix");
        adresse.setCodePostal(75000);
        adresse.setVille("Paris");

        //Creation d'un Livret A
        LivretA livretA = new LivretA(compte, 1.5);

        //Creation d'une Assurance Vie
        AssuranceVie assuranceVie = new AssuranceVie(compte, 100);

        //Creation d'un Virement
        Virement virement = new Virement(operation, "William Dupont");


        addAdress(adresse);
        addClient(client);
        addCompte(compte);
        addBanque(banque);
        addOperation(operation);
        addLivretA(livretA);
        addAssuranceVie(assuranceVie);
        addVirement(virement);


    }

    public static void addAdress(Adresse adresse) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(adresse);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addBanque(Banque banque) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(banque);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addCompte(Compte compte) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(compte);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addClient(Clients client) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addOperation(Operation operation) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(operation);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addAssuranceVie(AssuranceVie assuranceVie) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(assuranceVie);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addLivretA(LivretA livretA) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(livretA);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void addVirement(Virement virement) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(virement);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}