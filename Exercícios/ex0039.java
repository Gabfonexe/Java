package Exercícios;
import java.util.Scanner;

import Entities.Pessoa.Pessoa;
public class ex0039 {
/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
*/
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nome;
    int idade, tamanho;

    System.out.print("Quantas pessoas você vai digitar? ");
    tamanho = sc.nextInt();
    Pessoa [] pessoa = new Pessoa[tamanho];

    for (int i=0; i < pessoa.length; i++){

      System.out.printf("DADOS DA %d° PESSOA%n", (i+1));
      System.out.print("Nome: ");
      nome = sc.next();
      System.out.print("Idade: ");
      idade = sc.nextInt();
      pessoa[i] = new Pessoa(nome, idade);
    }
    String maisVelho = " ";
    int maior = 0;
    for (int i=0; i < pessoa.length; i++){
      if(pessoa[i].getIdade() > maior){
        maisVelho = pessoa[i].getNome();
        maior += pessoa[i].getIdade();
      }
    }
    System.out.println(maisVelho);

    sc.close();
  }
  
}
