package Entities.Produto;
/*Toda clase do java, herda os métodos da classe object */
public class Product {

  public String name;
  public double price;
  public int quantity;

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
