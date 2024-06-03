package Entities.Produto;

public class Product_Encapsulamento {

  private String name;
  private double price;
  private int quantity;


  //Construtor
  public Product_Encapsulamento (){

  }
  //Construtor
  public Product_Encapsulamento(String name, double price, int quantity){

    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  //Sobrecarga
  public Product_Encapsulamento(String name, double price){
    this.name = name;
    this.price = price;
  }

  // Encapsulamento

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }

  public int getQuantity(){
    return quantity;
  }
  // quantity não pode ser alterado.
}
