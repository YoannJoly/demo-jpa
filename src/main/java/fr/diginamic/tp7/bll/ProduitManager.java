package fr.diginamic.tp7.bll;

import fr.diginamic.tp7.dal.DAO;
import fr.diginamic.tp7.dal.DAOFactory;
import fr.diginamic.tp7.entity.Produit;

public class ProduitManager {
    private static volatile ProduitManager instance;
    private static DAO<Produit> produitImpl;

    private ProduitManager() {
        produitImpl = DAOFactory.getProduitDAO();
    }

    public static ProduitManager getInstance() {
        if (instance == null) {
            synchronized (ProduitManager.class) {
                if (instance == null) {
                    instance = new ProduitManager();
                }
            }
        }
        return instance;
    }

    public void addProduit(Produit produit) throws BLLException {
        try {
            produitImpl.addProduit(produit);
        } catch (Exception e) {
            throw new BLLException(e);
        }
    }
}
