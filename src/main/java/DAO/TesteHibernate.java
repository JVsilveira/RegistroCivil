package DAO;

import javax.persistence.EntityManager;

 // @author JVsilveira

public class TesteHibernate {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
            
        
            
        em.getTransaction().commit();
        em.close();
        
    }
}
