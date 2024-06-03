package Exercícios;
import java.util.Scanner;

import Entities.Employee;

import java.util.Locale;

public class ex0027 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    System.err.println("Digite o seu nome, salário bruto e taxa:");
    Employee funcionario = new Employee();

    funcionario.nome = sc.nextLine();
    funcionario.salarioBruto = sc.nextDouble();
    funcionario.taxa = sc.nextDouble();
    
    System.out.print(funcionario);

    System.err.print("Quantos porcentos de aumento?  ");
    double porcento = sc.nextDouble();
    double porcentagem = porcento / 100;
    funcionario.salarioAumento(porcentagem);

    System.out.println(funcionario);

    sc.close();

  }
  
}
