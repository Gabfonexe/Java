package Exercícios;
import java.util.Scanner;

public class ex0008 {
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num;

    System.err.println("Digite o número:");
    num = sc.nextInt();

    if (num >= 0){
      System.err.println("Não Negativo");
    }  
    else {
      System.err.println("Negativo");
    }  
    sc.close();
  }

  
}
