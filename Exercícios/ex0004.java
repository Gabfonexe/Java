package Exercícios;
import java.util.Scanner;
public class ex0004 {
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    double A, B, C, D;
    System.out.println("Número 1: ");
    A = sc.nextDouble();
    System.out.println("Número 2: ");
    B = sc.nextDouble();
    System.out.println("Número 3: ");
    C = sc.nextDouble();
    System.out.println("Número 4: ");
    D = sc.nextDouble();
    double produto_Ab = A * B;
    double produto_Cd = C * D;
    double diferença = produto_Ab - produto_Cd;
    System.out.printf("A x B = %.2f%nC x D = %.2f%nDiferença = %.2f%n", produto_Ab, produto_Cd, diferença);

    sc.close();




  }
  
}
