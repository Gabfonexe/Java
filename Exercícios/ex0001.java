package Exercícios;

import java.util.Locale;

public class ex0001 {
  // imprimir os dados corretamente com a versão EUA (US)
  public static void main(String[] args) {

    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'F'; // o char utiliza '' simples e não "" duplas

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    Locale.setDefault(Locale.US);

    System.err.println();
    System.out.println("Products: ");
    System.out.printf("%s, which price is $ %.2f%n", product1, price1);
    System.out.printf("%s, which price is $ %.2f%n", product2, price2);
    System.err.println();
    System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
    System.err.println();
    System.out.printf("Measure eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded: %.3f", measure);

  }

}
