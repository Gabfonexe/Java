package Exercícios;
import java.util.Locale;
import java.util.Scanner;

public class ex0037 {
/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int tamanho;
    System.out.print("Digite o tamanho da lista: ");
    tamanho = sc.nextInt();
    
    double[] lista = new double[tamanho];

    for (int i=0; i < lista.length; i++){
      System.out.print("Digite um número: ");
      lista[i] =  sc.nextDouble();
    }
    double soma = 0;
    for (int i=0; i < lista.length; i++){
      soma = soma + lista[i];
    }  
    double media = soma / tamanho;
    System.out.printf("Média do vetor: %.3f%n", media );
    System.out.println("Elementos abaixo da média: ");

    for (int i=0; i < lista.length; i++){
      if (lista[i] < media){
        System.out.printf("%.1f%n", lista[i]);
      }
    }







    sc.close();
  }
  
}
