package fr.diginamic.tp7.dal;

import fr.diginamic.tp7.dal.jpa.ProduitJpaImpl;
import fr.diginamic.tp7.entity.Produit;

public class DAOFactory {
    public static DAO<Produit> getProduitDAO() {
        return new ProduitJpaImpl();
    }
}

