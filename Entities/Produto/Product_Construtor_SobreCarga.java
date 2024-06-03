package Entities.Produto;

public class Product_Construtor_SobreCarga {
  public String name;
  public double price;
  public int quantity;

  /* Para criar um construtor : 
   * Basta colocar o public + nome da classe + especificar os parametros (args) de entrada
   * Utiliza-se o this para apontar a var da construção para o atributo da classe.
   * Isso protege o programa de futuros erros de ausencia nos atributos
   */
  public Product_Construtor_SobreCarga (String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  // construtor padrão
  public Product_Construtor_SobreCarga(){

  }
  /* Criando um método de sobrecarga
   * serve para um atributo da classe poder iniciar em forma de zero
   */
  public Product_Construtor_SobreCarga (String name, double price){
    this.name = name;
    this.price = price;
    // poderia usar this.quantity ou somente quantity, pois ele não existe como arg.
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
