package Exercícios;
import java.util.Scanner;

import Entities.Aluno.Aluno;
public class ex0028 {

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    Aluno aluno = new Aluno();
    System.out.println("Digite seu nome: ");
    aluno.aluno = sc.nextLine();
    System.err.println("digite as médias: ");

    aluno._1nota = sc.nextDouble();
    aluno._2nota = sc.nextDouble();
    aluno._3nota = sc.nextDouble();

    double media = aluno.notaAluno();
    double total = 60;

    if (media > 60){
      System.out.printf(" Nota Final = %.2f%n Passou", media);

    }
    else{
      System.out.printf(" Nota Final = %.2f%n Reprovou%n Faltou %.2f Pontos", media, (total - media));
    }

    



    
    sc.close();
   }


    
    
  

}
/*
    if ( aluno._1nota > 30){  
      System.err.println("Por favor digite um número entre 0 e 30:");
      aluno._1nota = sc.nextDouble();
      while (aluno._1nota > 30){
        System.err.println("Por favor digite um número entre 0 e 30:");
        aluno._1nota = sc.nextDouble();
      }
      aluno._2nota = sc.nextDouble();
      if (aluno._2nota > 35){
        System.err.println("Por favor digite um número entre 0 e 35:");
        aluno._2nota = sc.nextDouble();
        while (aluno._2nota > 35){
        System.err.println("Por favor digite um número entre 0 e 35:");
        aluno._2nota = sc.nextDouble();
      }
      aluno._3nota = sc.nextDouble();
      if (aluno._3nota > 35){
        System.err.println("Por favor digite um número entre 0 e 35:");
        aluno._3nota = sc.nextDouble();
        while (aluno._3nota > 35){
        System.err.println("Por favor digite um número entre 0 e 35:");
        aluno._3nota = sc.nextDouble();
        }
      }

    else {
      aluno._2nota = sc.nextDouble();
      aluno._3nota = sc.nextDouble();
    }
 */