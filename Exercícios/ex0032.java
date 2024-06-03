package Exercícios;
import java.util.Scanner;
import java.util.Locale;

public class ex0032 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    System.out.print("Quantos números você quer digitar? ");
    int tamanho = sc.nextInt();
    double [] lista = new double[tamanho];
    for (int i=0; i < lista.length; i++){
      System.out.print("Digite um número: ");
      lista[i] = sc.nextDouble();
    }
    double soma = 0.0;
    for (int i=0; i < lista.length; i++){
      soma += lista[i];
    }
    double media = soma / lista.length;

    System.out.print("Valores: " );
    for (int i=0; i < lista.length; i++){
      System.out.printf("%.1f ", lista[i]);
    }
    System.out.println();
    System.out.printf("Soma: %.2f%n", soma);
    System.out.printf("Média: %.2f%n", media);





    sc.close();
  }  
}
