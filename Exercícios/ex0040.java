package Exercícios;
import java.util.Scanner;

import Entities.Aluno.ALuno_2;

import java.util.Locale;

public class ex0040 {
/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).   */

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int tamanho;
    String nome;
    double notaUm, notaDois;

    System.out.println("Quantos alunos serão Digitados? ");
    tamanho = sc.nextInt();
    ALuno_2[] aluno = new ALuno_2[tamanho];

    for (int i=0; i < aluno.length; i++){

      System.out.printf("Digite nome, primeira e segunda nota do %d° aluno%n", (i+1));
      nome = sc.next();
      notaUm = sc.nextDouble();
      notaDois = sc.nextDouble();
      aluno[i] = new ALuno_2(nome, notaUm, notaDois);
    }
    System.out.println("Alunos Aprovados: ");
    for (int i=0; i < aluno.length; i++){
      double media = (aluno[i].getNotaDois() + aluno[i].getNotaUm()) / 2;
      if (media >= 6){
        System.out.println(aluno[i].getNome());
      }
      else if (media < 6 ){
        System.out.println("Nenhum aluno aprovado");
      }
    }
   sc.close();
  }
}


