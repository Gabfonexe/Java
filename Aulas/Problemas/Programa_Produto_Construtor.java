package Aulas.Problemas;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto.Product_Construtor;

public class Programa_Produto_Construtor {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    int quantity = sc.nextInt();

    // serve para evitar ausencia de atributos da classe.
    Product_Construtor product  = new Product_Construtor(name, price, quantity);

    System.err.println();
    System.err.println("Product data: " + product); // agora o product ja tem a toString() reescrita

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    sc.close();


  }

  
}
