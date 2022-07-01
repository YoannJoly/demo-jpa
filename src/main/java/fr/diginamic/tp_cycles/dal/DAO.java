package fr.diginamic.tp_cycles.dal;


public interface DAO<T> {
    void addObject(T obj) throws DALException;
}
