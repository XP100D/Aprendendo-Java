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
public class Book {
  private String nome;
  private int codigo;
  private double price;
  private boolean impresso;
  Autor autor;


 
  public Book(Autor autor){
    this();
    this.autor = autor;
  }
  
   public Book(){
    autor = new Autor();
    this.impresso = true;
  }
  
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  
  public void setPrice(double price){
    this.price = price;
  }
  
  public void discount(double discount){
    if (discount < 30){
      discount /= 100;
      this.price -= this.price * discount;
    }
  }
  
  public String getNome(){
      return this.nome;
  }
  
  public int getCodigo(){
      return this.codigo;
  }
  
  public double getPrice(){
      return this.price;
  }
  
  public void showAllData(){
    System.out.println(codigo + " - " + nome);
    System.out.printf("R$ %.2f\n", price);
    System.out.println("");
    if(autor != null){
        autor.showAll();
    }
   
   for(int i = 1; i <= 30; i++){
     System.out.print("-");
   }
   System.out.println("");
  }
}

