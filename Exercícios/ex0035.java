package Exercícios;
import java.util.Locale;
import java.util.Scanner;

public class ex0035 {
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).  */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int posmaior;
    double maior;
    System.out.printf("Digite o tamanho: ");
    int tamanho = sc.nextInt();
    System.out.println();
   
    double [] lista = new double[tamanho];


    for (int i=0; i < lista.length; i++){

      System.out.printf("Digite um número: ");
      lista[i] = sc.nextDouble();
    }

    maior = lista[0];
    posmaior = 0;

    for (int i=0; i < lista.length; i++){

      if(lista[i] > maior){
        maior = lista[i];
        posmaior = i;
      }
    }
    System.out.print("Maior valor = " + maior);
    System.out.println();
    System.out.print("Posição do maior valor = " + posmaior);

    sc.close();
  }
  
}
