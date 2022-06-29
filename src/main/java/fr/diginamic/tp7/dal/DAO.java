package fr.diginamic.tp7.dal;

public interface DAO<T> {
    void addProduit(T obj) throws DALException;
}
