package Exercícios;
import java.util.Scanner;
import java.util.Locale;

public class ex0025 {
//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int num;
    double quadrado, cubo;

    System.out.println("Número:");
    num = sc.nextInt();

    for (double i=1; num>=i; i++){

      quadrado = Math.pow(i, 2);
      cubo = Math.pow(i, 3);

      System.err.printf("%.1f %.1f %.1f%n", i,quadrado, cubo);
    }
    sc.close();
  }
}
