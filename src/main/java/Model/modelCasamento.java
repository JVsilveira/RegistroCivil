package Model;

 // @author JVsilveira

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class modelCasamento extends modelMaeRegistro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String nomeNoivo, nomeNoiva, novoNome, testemunha1, testemunha2, regimeBens;

    public modelCasamento(String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
    }

    public modelCasamento(String nomeNoivo, String nomeNoiva, String novoNome, String testemunha1, String testemunha2, String regimeBens, String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
        this.nomeNoivo = nomeNoivo;
        this.nomeNoiva = nomeNoiva;
        this.novoNome = novoNome;
        this.testemunha1 = testemunha1;
        this.testemunha2 = testemunha2;
        this.regimeBens = regimeBens;
    }

    public String getNomeNoivo() {
        return nomeNoivo;
    }

    public void setNomeNoivo(String nomeNoivo) {
        this.nomeNoivo = nomeNoivo;
    }

    public String getNomeNoiva() {
        return nomeNoiva;
    }

    public void setNomeNoiva(String nomeNoiva) {
        this.nomeNoiva = nomeNoiva;
    }

    public String getNovoNome() {
        return novoNome;
    }

    public void setNovoNome(String novoNome) {
        this.novoNome = novoNome;
    }

    public String getTestemunha1() {
        return testemunha1;
    }

    public void setTestemunha1(String testemunha1) {
        this.testemunha1 = testemunha1;
    }

    public String getTestemunha2() {
        return testemunha2;
    }

    public void setTestemunha2(String testemunha2) {
        this.testemunha2 = testemunha2;
    }

    public String getRegimeBens() {
        return regimeBens;
    }

    public void setRegimeBens(String regimeBens) {
        this.regimeBens = regimeBens;
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