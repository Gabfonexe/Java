package Entities.Produto;

public class Product_Construtor {
  
  public String name;
  public double price;
  public int quantity;

  /* Para criar um construtor : 
   * Basta colocar o public + nome da classe + especificar os parametros (args) de entrada
   * Utiliza-se o this para apontar a var da construção para o atributo da classe.
   * Isso protege o programa de futuros erros de ausencia nos atributos
   */
  public Product_Construtor (String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double totalValueInStock(){
    return price * quantity;
  }
  public void addProducts(int quantity){ // aqui add um parametro pois não irá retornar nada
    this.quantity += quantity; // o this aponta para o valor do atributo da classe e não o parametro
  }
  public void removeProducts(int quantity){
    this.quantity -= quantity; // o this aponta para o valor do atributo da classe e não o parametro
  }
  public String toString(){ // o toString() é um método de herança da classe object, estou reescrevendo ele
    return name
    + String.format("%.2f", price)
    + ", "
    + quantity
    + " units, Total: $ "
    + String.format("%.2f", totalValueInStock());
  }

  
}

  


