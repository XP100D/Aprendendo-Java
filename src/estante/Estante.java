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
    static final int LENGTH = 7;
  public static void main(String[] args) {
    
      // Criando Array "estante" do tipo Book
      Book estante[];    
      
      // Instanciando Array e definindo seu tamanho igual ao valor da variável final LENGTH
      estante = new Book[LENGTH];        
       
      // Criando variável livro do tipo Book
      Book livro;                        
      
      //Cria um Array de double para guardar os preços antes do disconto.
      double[] arrayPrice = new double[LENGTH];
      
      
      //Espaço reservado para a criação do menu de interação via prompt
      //
      //
      //
      //
      //
      
      
      
      //Loop que cria Objetos do Tipo Book e o atribui a uma posição no Array do mesmo tipo
      for (int i = 0; i < estante.length; i++){
          //Cria um Objeto para a posição do array apontada pelo indice "i"
          estante[i] = new Book();
          
          //Utiliza o método da classe para atribuir um código único sequencial para o Objeto
          estante[i].setCodigo(i+1);
          
          //cria um valor double randomico entre 0 e 55
          estante[i].setPrice(Math.random() * 55);
          
          //Atribui o valor do atributo "price" do objeto em questão no array de preços correspondente
          arrayPrice[i] = estante[i].getPrice();
          
          //aplica o disconto de 15%
          estante[i].discount(15);
          
          //Mostra na tela o preço antigo do livro com duas casas decimais
          System.out.printf("Preço anterior: R$ %.2f", arrayPrice[i]);
          System.out.println();
          
          //Mostra todos os dados do produto
          estante[i].showAllData();
      }
  }
}
