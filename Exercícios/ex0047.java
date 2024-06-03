package Exercícios;
import java.util.Scanner;

import Entities.Pessoa.Pessoa.PessoaEx0047;
import Entities.Pessoa.Pessoa.PessoaFisicaEx0047;
import Entities.Pessoa.Pessoa.PessoaJuridicaEx47;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class ex0047 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    List <PessoaEx0047> lista = new ArrayList<>();

    System.out.print("Digite a quantidade de pessoas: ");
    int n = sc.nextInt();

    for (int i=1; i <= n; i++){
      System.out.println("Dados Pessoa #" + i + ":");
      System.out.print("Física ou Jurídica [f/j]:  ");
      char c = sc.next().charAt(0);
      if (c == 'f'){
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Rendimento Anual: ");
        Double rendimentoAnual = sc.nextDouble();
        System.out.print("Gastos de Saúde: ");
        double gastoSaude = sc.nextDouble();
        lista.add(new PessoaFisicaEx0047(nome, rendimentoAnual, gastoSaude));
      }
      if (c == 'j'){

        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Rendimento Anual: ");
        Double rendimentoAnual = sc.nextDouble();
        System.out.print("Quantidade de Funcionários: ");
        int funcionarios = sc.nextInt();
        lista.add(new PessoaJuridicaEx47(nome, rendimentoAnual, funcionarios));
      }
    }
    Double var = 0.0;
    for (PessoaEx0047 pessoas : lista){

      System.out.println(pessoas.getNome() + ": $ " + String.format("%.2f",pessoas.taxa()));
      var = var + pessoas.taxa();
    }

    System.out.println("Valor Total de Impostos: $ " + String.format("%.2f",var));

    







    sc.close();
  }
  


  
}
