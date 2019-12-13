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
public class Estante {
  public static void main(String[] args) {
    
    Autor autor = new Autor();
    Autor outroAutor = new Autor("Jeferson");
    Book livro1 = new Book(autor);
    
    livro1.setNome("Contos Românticos");
    livro1.setPrice(32.99);
    livro1.discount(15);
    livro1.setCodigo(1);
    livro1.showAllData();
    
    
    Book livro2 = new Book();
    
    livro2.setNome("Contos Felizes");
    livro2.setPrice(35); 
    livro2.discount(15);
    livro2.setCodigo(2);
    livro2.showAllData();
    
    
    Book livro3 = new Book(autor);
    
    livro3.setNome("Contos Eróticos");
    livro3.setPrice(87.90);
    livro3.discount(15);
    livro3.setCodigo(3);
    livro3.showAllData();
    
    
    Book livro4 = new Book(outroAutor);
    
    livro4.setNome("Contos Sádicos");
    livro4.setPrice(125.99);
    livro4.discount(50);
    livro4.setCodigo(4);
    livro4.showAllData();
    
    
    Book livro5 = new Book();
    
    livro5.setNome("Contos de Terror");
    livro5.setPrice(9.99);
    livro5.discount(10);
    livro5.setCodigo(5);
    livro5.showAllData();
    
    Book livro6 = new Book(autor);
    
    livro6.setNome("Contos Ociosos");
    livro6.setPrice(9.99);
    livro6.discount(10);
    livro6.setCodigo(6);
    livro6.showAllData();
  }
}
