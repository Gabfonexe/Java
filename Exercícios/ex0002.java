package Exercícios;
import java.util.Scanner;
public class ex0002 {
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int a, b;
    System.out.println("Digite o primeiro número : ");
    a = sc.nextInt();
    System.out.println("Digite o segundo número : ");
    b = sc.nextInt();
    int soma = a + b;
    System.out.printf("Primeiro número: %d%n", a);
    System.out.printf("Segundo número: %d%n", b);
    System.out.println("Soma = " + soma);

    sc.close();
  }

  
}
