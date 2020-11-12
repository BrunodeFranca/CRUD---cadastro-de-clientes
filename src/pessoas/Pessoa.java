/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class Pessoa {
   private int id;
  private String nome;
  private String sexo;
  private Date dataNascimento;
  private String profissao;
  private String cpf;
  private String tipoSanguineo;
  private String endereco;
  private String numeroEndereco;
  private String bairroEndereco;
  private String estadoEndereco;
  private String cepEndereco;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }

    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public String getProfissao() {
        return profissao;
    }


    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }


    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getEndereco() {
        return endereco;
    }

   
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    
    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

  
    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }
    
    public String getEstadoEndereco() {
        return estadoEndereco;
    }

    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }

  
    public String getCepEndereco() {
        return cepEndereco;
    }

    
    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }
}
