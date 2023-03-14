package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//@author JVsilveira

public class JPAUtil {
    private static final EntityManagerFactory emfAdonai = Persistence.createEntityManagerFactory("postgres");
 
    public EntityManager getEntityManager() {
            return emfAdonai.createEntityManager();
    }
}
