package Exercícios;
import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoa.Pessoa;

public class ex0033 {
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.  */

  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    String nome;
    int idade;
    double altura;

    System.out.print("Quantas pessoas serão digitadas? ");
    int tamanho = sc.nextInt();
    double tamanho2 = tamanho;
    sc.nextLine();
    Pessoa[] pessoa = new Pessoa[tamanho];
    double qtdPessoasMenores = 0.0;
    ///String [] nomePessoasMenores = new String[tamanho];

    for (int i=0; i < pessoa.length; i++){
      System.out.println("Nome: ");
      nome = sc.next();
      System.out.println("Idade: ");
      idade = sc.nextInt();
      System.out.println("Altura: ");
      altura = sc.nextDouble();
      System.out.println();
      pessoa[i] = new Pessoa(nome, idade, altura);
   
    }
    for (int i=0; i < pessoa.length; i++){
      System.out.printf("Dados da %d° Pessoa%n",(i +1) );
      System.out.print(pessoa[i]);
      System.out.println();
    
    }
    System.out.println("Menores de 16: "); 
    for (int i=0; i<pessoa.length; i++){
      if (pessoa[i].getIdade() < 16){  
        System.out.println(pessoa[i].getNome());
        qtdPessoasMenores =+ 1;
      }
    }
    double porcent = (qtdPessoasMenores / tamanho2) * 100;
    //System.out.println(qtdPessoasMenores);
    //System.out.println(tamanho2);
    System.out.println("Porcentagem: " + porcent);

    sc.close();
  }
  
}
