package Exercícios;
import java.util.Scanner;
import java.util.Locale;
public class ex0005 {
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int num_Funcionario, horas_Trabalhadas;
    double salario_Hora, salario_Mes;

    System.err.println("Digite seu número de funcionário: ");
    num_Funcionario = sc.nextInt();
    System.out.println("Digite as horas trabalhadas: ");
    horas_Trabalhadas = sc.nextInt();
    System.err.println("Digite seu salário por hora: ");
    salario_Hora = sc.nextDouble();
    System.err.println();


    salario_Mes = salario_Hora * horas_Trabalhadas;

    System.err.printf("Número: %d%nSalário: R$ %.2f", num_Funcionario, salario_Mes );
    
    sc.close();



  }
  
}
