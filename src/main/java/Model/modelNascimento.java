package Model;

 //@author JVsilveira

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 

public class modelNascimento extends modelMaeRegistro {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        
    private String localNascimento, nomeAvoPaterno1, NomeAvoPaterno2, nomeAvoMaterno1, nomeAvoMaterno2, sexo, dnv;

    public modelNascimento(String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
    }

    public modelNascimento(String localNascimento, String nomeAvoPaterno1, String NomeAvoPaterno2, String nomeAvoMaterno1, String nomeAvoMaterno2, String sexo, String dnv, String nome, String nomeMae, String nomePai, String endereco, String dataRegistro, String dataNascimento) {
        super(nome, nomeMae, nomePai, endereco, dataRegistro, dataNascimento);
        this.localNascimento = localNascimento;
        this.nomeAvoPaterno1 = nomeAvoPaterno1;
        this.NomeAvoPaterno2 = NomeAvoPaterno2;
        this.nomeAvoMaterno1 = nomeAvoMaterno1;
        this.nomeAvoMaterno2 = nomeAvoMaterno2;
        this.sexo = sexo;
        this.dnv = dnv;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getNomeAvoPaterno1() {
        return nomeAvoPaterno1;
    }

    public void setNomeAvoPaterno1(String nomeAvoPaterno1) {
        this.nomeAvoPaterno1 = nomeAvoPaterno1;
    }

    public String getNomeAvoPaterno2() {
        return NomeAvoPaterno2;
    }

    public void setNomeAvoPaterno2(String NomeAvoPaterno2) {
        this.NomeAvoPaterno2 = NomeAvoPaterno2;
    }

    public String getNomeAvoMaterno1() {
        return nomeAvoMaterno1;
    }

    public void setNomeAvoMaterno1(String nomeAvoMaterno1) {
        this.nomeAvoMaterno1 = nomeAvoMaterno1;
    }

    public String getNomeAvoMaterno2() {
        return nomeAvoMaterno2;
    }

    public void setNomeAvoMaterno2(String nomeAvoMaterno2) {
        this.nomeAvoMaterno2 = nomeAvoMaterno2;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDnv() {
        return dnv;
    }

    public void setDnv(String dnv) {
        this.dnv = dnv;
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
