package Aulas.MembrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

import Entities.Calculadora.Calculator;

public class Membros_Estáticos_Exemplo_2 {

  public static void main(String[] args) {

  Calculator calc = new Calculator();
  Locale.setDefault(Locale.US);
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter radius: ");
    double radius = sc.nextDouble();
    double c = calc.circumFerence(radius);
    double v = calc.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", calc.PI);

    sc.close();
  }
  
}
