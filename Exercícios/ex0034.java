package Exercícios;
import java.util.Scanner;
public class ex0034 {
  public static void main(String[] args) {
  /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.  */  

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho: ");
    int tamanho = sc.nextInt();
    int qtdPares = 0;

    int[] lista = new int[tamanho];

    for (int i=0; i < lista.length; i++){

      System.out.println("Digite um número: ");
      lista[i] =  sc.nextInt();
    }
    System.out.println("Números Pares:");
    for (int i=0; i < lista.length; i++){
      if (lista[i] % 2 == 0){
        qtdPares += 1;
        System.out.print(lista[i] + " ");
      }
    }
    System.out.println();
    System.out.println("Quantidade de Pares = " + qtdPares);
    sc.close();
  }
}
