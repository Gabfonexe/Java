package Aulas.Problemas;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto.Product;

public class Programa_Produto {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    Product product = new Product();

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = sc.nextLine();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    product.quantity = sc.nextInt();

    System.err.println();
    System.err.println("Product data: " + product); // agora o product ja tem a toString() reescrita

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
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
