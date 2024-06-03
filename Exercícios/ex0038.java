package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex0038 {
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US); 

    int tamanho;
    System.out.print("Digite o tamanho da lista: ");
    tamanho = sc.nextInt();
    int[] lista = new int[tamanho];
    double soma = 0;
    double qtdPares = 0;
    for (int i=0; i < lista.length; i++){
      System.out.print("Digite um número: ");
      lista[i] = sc.nextInt();
      if (lista[i] % 2 ==0){
        soma = soma + lista[i];
        qtdPares++;
      }
    }
    double media = soma / qtdPares;
    if (qtdPares == 0){
      System.out.println("Nenhum número par");
    }
    else {
      System.out.printf("Media dos pares = %.1f", media);
    }
    sc.close();
  }
}
  


