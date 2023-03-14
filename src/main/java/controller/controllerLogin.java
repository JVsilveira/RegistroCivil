package controller;

//@author JVsilveira

import DAO.usuarioDAO;
import Model.modelUsuario;
import View.viewJanelaPrincipal;
import View.viewLogin;
import controllerHelper.loginHelper;
import javax.persistence.EntityManager;

public class controllerLogin {
    
    private final viewLogin view;
    private final loginHelper helper;
    private final usuarioDAO usuDAO; 

    public controllerLogin(viewLogin view, controllerLogin controller) {
        this.view = view;
        this.usuDAO = new usuarioDAO((EntityManager) view);
        this.helper = new loginHelper(view);
    }

public void acessarSistema(){
    
    modelUsuario modelUsuario = helper.pegarDados(); //pegar dados da view
    
    //consultar dados no banco
       
        boolean usuarioAutenticado = usuDAO.consultaLogin(modelUsuario);
   
           if(usuarioAutenticado == true){ 
            viewJanelaPrincipal viewJanelaPrincipal = new viewJanelaPrincipal();
            viewJanelaPrincipal.setVisible(true);
            this.view.dispose(); //fecha a view atual
        }else{
            this.view.exibeMensagem("Usuario ou senha inválidos!");
        }
        
    }
               
}
