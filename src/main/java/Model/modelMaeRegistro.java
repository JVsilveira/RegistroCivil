package Model;

//@author JVsilveira
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class modelMaeRegistro {

    protected String nome, nomeMae, nomePai, endereco;
    protected Date dataRegistro, dataNascimento;

    public modelMaeRegistro(String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.endereco = endereco;
        try {
            this.dataRegistro = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataRegistro);
        } catch (ParseException ex) {
            Logger.getLogger(modelMaeRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(modelMaeRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}


