/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante;

/**
 *
 * @author SSD
 */
public class Autor {
  private String nome;
  private String sobrenome;
  private String cpf;
  private String email;
  private String segundoEmail;
  private String telefone;
  

  public Autor(String nome){
      this.nome = nome;
  }
  public Autor(){
      nome = "Natanael";
      sobrenome = "Dos Anjos";
      cpf = "05447725127";
      email = "natan.ns.ns@gmail.com";
      telefone = "(61) 99117-5320";
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setSegundoEmail(String segundoEmail){
    this.segundoEmail = segundoEmail;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
  
  public void showAll(){
    if((this.nome != null) && (sobrenome != null)){
        System.out.println("Autor: " + nome + " " + sobrenome);
    }
    else{
        if((this.nome != null) && (sobrenome == null)){
            System.out.println("Nome: " + nome);
        }
    }
    
    if(this.email != null){
        System.out.println("Email: " + email);
    }
    if(this.cpf != null){
        System.out.println("CPF: " + cpf);
    }
    if(this.segundoEmail != null) {
        System.out.println("2º Email: " + segundoEmail);
    }
    if(telefone != null){
        System.out.println("Telefone: " + telefone);
    }
  }
}

