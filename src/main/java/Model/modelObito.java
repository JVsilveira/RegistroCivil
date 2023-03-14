package Model;

// @author JVsilveira

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class modelObito extends modelMaeRegistro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String localObito, deixouFilhos, nomefilhos, localEnterro, EnterroOuCremacao, eleitor, testamento, declaracaoObito;
    private Date dataObito;
    
    public modelObito(String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
    }

    public modelObito(String localObito, String deixouFilhos, String nomefilhos, String localEnterro, String EnterroOuCremacao, String eleitor, String testamento, String declaracaoObito, Date dataObito, String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
        this.localObito = localObito;
        this.deixouFilhos = deixouFilhos;
        this.nomefilhos = nomefilhos;
        this.localEnterro = localEnterro;
        this.EnterroOuCremacao = EnterroOuCremacao;
        this.eleitor = eleitor;
        this.testamento = testamento;
        this.declaracaoObito = declaracaoObito;
        this.dataObito = dataObito;
    }

    public String getLocalObito() {
        return localObito;
    }

    public void setLocalObito(String localObito) {
        this.localObito = localObito;
    }

    public String getDeixouFilhos() {
        return deixouFilhos;
    }

    public void setDeixouFilhos(String deixouFilhos) {
        this.deixouFilhos = deixouFilhos;
    }

    public String getNomefilhos() {
        return nomefilhos;
    }

    public void setNomefilhos(String nomefilhos) {
        this.nomefilhos = nomefilhos;
    }

    public String getLocalEnterro() {
        return localEnterro;
    }

    public void setLocalEnterro(String localEnterro) {
        this.localEnterro = localEnterro;
    }

    public String getEnterroOuCremacao() {
        return EnterroOuCremacao;
    }

    public void setEnterroOuCremacao(String EnterroOuCremacao) {
        this.EnterroOuCremacao = EnterroOuCremacao;
    }

    public String getEleitor() {
        return eleitor;
    }

    public void setEleitor(String eleitor) {
        this.eleitor = eleitor;
    }

    public String getTestamento() {
        return testamento;
    }

    public void setTestamento(String testamento) {
        this.testamento = testamento;
    }

    public String getDeclaracaoObito() {
        return declaracaoObito;
    }

    public void setDeclaracaoObito(String declaracaoObito) {
        this.declaracaoObito = declaracaoObito;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
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