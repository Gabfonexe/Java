package Aulas.MembrosEstaticos;
import java.util.Scanner;

import Entities.Calculadora.Calculator2;

public class Membros_Estáticos_Exemplo_3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Raio: ");
    double radius = sc.nextDouble();

    double c = Calculator2.circumFerence(radius);
    double v = Calculator2.volume(radius);

    System.out.printf("Circunferência: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("Valor de PI: %.2f%n", Calculator2.PI);

    sc.close();
  }




  
}
