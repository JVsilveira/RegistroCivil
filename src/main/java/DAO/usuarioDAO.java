package DAO;

 //@author JVsilveira
import Model.modelUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class usuarioDAO {
    private final EntityManager em;

     public usuarioDAO(EntityManager em) {
        this.em= em;
    }
  
    public modelUsuario inserir (modelUsuario modelUsuario){
        em.persist(modelUsuario);
        return modelUsuario;
        }
    
    public modelUsuario atualizar (modelUsuario modelUsuario){
        em.merge(modelUsuario);
        em.persist(modelUsuario);
        return modelUsuario;
    }
    
    public modelUsuario inserirOuAtualizar (modelUsuario modelUsuario){
        if(modelUsuario.getId() > 0){
            return this.atualizar(modelUsuario);
        }
        return modelUsuario;
    }
    
    public void deletar (modelUsuario modelUsuario){
        em.merge(modelUsuario);
        em.remove(modelUsuario);
        }
    
    public modelUsuario selecionarPorId(modelUsuario modelUsuario){
        return em.find(modelUsuario.class, modelUsuario);
        }
    
    public List<modelUsuario> selecionarTodos (){
         
        String jpql = "select u from registrousuario as u" ;
        Query query = em.createQuery(jpql);
        
        return retornoListacomBaseNaConsulta(query);
        }
     
    public boolean consultaLogin (modelUsuario modelUsuario){
                 
        String jpql = "select u from registrousuario as u where u.nome = :pNome and u.senha = :pSenha " ;
        
        Query query = em.createQuery(jpql);
        query.setParameter("pNome", modelUsuario.getNome());
        query.setParameter("pSenha", modelUsuario.getSenha());
        return !retornoListacomBaseNaConsulta(query).isEmpty();
        }    
    
   private List<modelUsuario> retornoListacomBaseNaConsulta(Query query) {
        List<modelUsuario> modelUsuario;
        try{
            modelUsuario = query.getResultList();
        }catch(NoResultException e){
            modelUsuario = new ArrayList<>();
        }
        return modelUsuario;
    }
     
}
