package fr.diginamic.tp_cycles.dal;

import fr.diginamic.tp_cycles.dal.jpa.ObjectJpaImpl;

public class DAOFactory {
    public static DAO<Object> getObjectDAO() {
        return new ObjectJpaImpl();
    }
}

