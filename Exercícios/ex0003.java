package Exercícios;
import java.util.Locale;
import java.util.Scanner;
public class ex0003 {
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.err.println("Digite o valor do Raio: ");
    double raio;
    raio = sc.nextDouble();
    double quadrado_Raio = Math.pow(raio, 2.0);
    double area = 3.14159 * quadrado_Raio;
    Locale.setDefault(Locale.US);
    System.out.printf("Raio: %f m%nArea: %.4f m²%n", raio, area);

    sc.close();

  }
}
