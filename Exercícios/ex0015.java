package Exercícios;
import java.util.Scanner;

public class ex0015 {
//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double salario, var, var2, var3;
    double imposto, imposto2, imposto3;


    System.out.println("Digite o salário: ");
    salario = sc.nextDouble();

    if(salario <= 2000){
      System.out.println("Isento");
    }
    else if (salario > 2000 && salario <= 3000){

      var = salario - 2000;
      imposto = var * 8/100;
      System.out.println ("R$ " + imposto);
    }
    else if (salario > 3000 && salario <= 4500){

      var = salario - 2000;
      if (var > 1000){
        var2 = var - 1000;
        var -= var2;
        imposto = var * 8/100;
        imposto2 = var2 * 18/100;
        double soma = imposto + imposto2;
        System.out.println("R$ " + soma);
      }
    }
    else if (salario > 4500){
      // 1000 - 8% -> salario - 2000 = salario2
      // 1500 - 18% -> salario2 - 1000 = salario3
      // 20 - 28% -> salario3 - 1500 = salario final

      var = salario - 2000;
      if (var > 1000){
        var2 = var - 1000;
        var -= var2;
        var3 = var2 - 1500;
        var2 -= var3;
        imposto = var * 8/100;
        imposto2 = var2 * 18/100;
        imposto3 = var3 * 28/100;
        double soma = imposto + imposto2 + imposto3;
        System.out.println("R$ " + soma);

        }
      sc.close();
      }
      
    
  
  }
}
