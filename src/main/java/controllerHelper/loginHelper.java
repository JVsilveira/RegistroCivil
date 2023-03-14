package controllerHelper;

// @author JVsilveira

import Model.modelUsuario;
import View.viewLogin;
import javax.swing.JOptionPane;


public class loginHelper implements IHelper{

    private final viewLogin view;

    public loginHelper(viewLogin view) {
        this.view = view;
    }
   
    @Override
    public modelUsuario pegarDados(){
        
        String nome = view.getjTextFieldnome().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        modelUsuario modelUsuario = new modelUsuario(nome, senha);
        return modelUsuario;
    }
    
    public void exibeMensagem(){
        JOptionPane.showMessageDialog(null,"Usuario ou senha inválidos!");
    }
    
    public void setarDados(modelUsuario modelUsuario){
        String nome = modelUsuario.getNome();
        String senha = modelUsuario.getSenha();
        
        view.getjTextFieldnome().setText(nome);
        view.getjPasswordFieldsenha().setText(senha);
    }
    
    @Override
    public void limparTela(){
        view.getjTextFieldnome().setText("");
        view.getjPasswordFieldsenha().setText("");
    }   
}
