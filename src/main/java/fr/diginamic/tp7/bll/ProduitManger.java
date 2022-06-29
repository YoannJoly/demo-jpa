package fr.diginamic.tp7.bll;

import fr.diginamic.tp7.dal.DAO;
import fr.diginamic.tp7.dal.DAOFactory;
import fr.diginamic.tp7.entity.Produit;

public class ProduitManger {
    private static volatile ProduitManger instance;
    private static DAO<Produit> produitImpl;

    private ProduitManger() {
        produitImpl = DAOFactory.getProduitDAO();
    }

    public static ProduitManger getInstance() {
        if (instance == null) {
            synchronized (ProduitManger.class) {
                if (instance == null) {
                    instance = new ProduitManger();
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
