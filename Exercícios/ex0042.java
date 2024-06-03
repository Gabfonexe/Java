package Exercícios;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import Entities.Aluno.ALuno_2;

public class ex0042 {
/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.  */

public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  int qtdQuartdos, numQuarto;
  String nome, email;

  System.out.println("Quantos quartos irá alugar? ");
  qtdQuartdos = sc.nextInt();

  ALuno_2 [] aluno = new ALuno_2[qtdQuartdos];

  for ( int i=1; i <= aluno.length; i++){
    System.out.println("Aluguel #" + i + ":");
    System.out.print("Digite o nome: ");
    nome = sc.next();
    System.out.print("Email: ");
    email = sc.next();
    aluno[i] = new ALuno_2(nome, email); 
    System.out.println("Quarto: ");
    numQuarto = sc.nextInt();

    aluno[numQuarto] = new ALuno_2(nome, email); // instanciando o num do quarto 
  }

  System.out.println();
  System.out.println("Quartos Alugados: ");

  for( int i=0; i < 10; i++){
    if (aluno[i] != null){
      System.out.println(aluno[i]);
    }
  }

  System.out.println();
  sc.close();
  }
}
