package controller;

// @author JVsilveira

import DAO.usuarioDAO;
import Model.modelUsuario;
import View.viewCadastro;
import controllerHelper.cadastroHelper;
import javax.persistence.EntityManager;


public class controllerCadastro {
    private final viewCadastro view;
    private final cadastroHelper helper;
    private final usuarioDAO usuDAO;

    public controllerCadastro(viewCadastro view) {
        this.view = view;
        this.usuDAO = new usuarioDAO((EntityManager) view);
        this.helper = new cadastroHelper(view);
    }
    
    public void salvaUsuario(){
         modelUsuario modelUsuario = helper.pegarDados();
         usuDAO.inserir(modelUsuario);
        
   }
}
