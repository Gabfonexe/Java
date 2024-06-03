package Exercícios;
import java.util.Scanner;
public class ex0036 {
/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.  */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o tamanho: ");
    int tamanho = sc.nextInt();
    int[] listaA = new int[tamanho];
    int[] listaB = new int[tamanho];
    int[] listaC = new int[tamanho];


    for (int i=0; i < listaA.length; i++){
      System.out.print("Digite os valores do vetor A: ");
      listaA[i] = sc.nextInt();
    }
    for (int i=0; i < listaB.length; i++){
      System.out.print("Digite os valores do vetor B: ");
      listaB[i] = sc.nextInt();
    }
    System.out.println("LISTA C: ");
    for (int i=0; i < listaB.length; i++){
      listaA[i] += listaB[i];
      listaC[i] += listaA[i];
      System.out.println(listaC[i]);
    }
    sc.close();
  }  
}
