package Exercícios;
import java.util.Scanner;
public class ex0031 {
/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho da lista: ");
    int n = sc.nextInt();
    int i;
    int[] lista = new int[n];
    
    for (i=0; i < lista.length; i++){
      System.out.println("Digite um número: ");
      lista[i] = sc.nextInt();
    }

    System.out.println("Negativos: ");

    for (i=0; i < lista.length; i++){
      if (lista[i] < 0){
        System.out.println(lista[i]);
      }
    }

    sc.close();
  }
}
