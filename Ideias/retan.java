package Ideias;

import java.util.Scanner;
import java.util.Locale;

public class retan {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Double altura, base, area;

    System.out.print("Digite a altura: ");
    altura = sc.nextDouble();
    System.out.print("Digite a base: ");
    base = sc.nextDouble();
  
    area = base * altura;
    System.out.printf("Área do Retângulo: %.2f ", area);

    sc.close();
  }
  
}
