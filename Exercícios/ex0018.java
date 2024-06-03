package Exercícios;
import java.util.Scanner;
public class ex0018 {
//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num, clientesAlcool, clientesGasolina, clientesDiesel;
    System.out.printf("OPÇÕES:%n [1] ÁLCOOL%n [2] GASOLINA%n [3] DIESEL%n [4] FIM%n");

    System.err.print("digite a opção desejada: ");
    num = sc.nextInt();
    System.out.println();

    clientesAlcool = 0;
    clientesGasolina = 0;
    clientesDiesel = 0;

    while(num != 4){

      switch (num) {
        case 1:
          clientesAlcool += num;
          System.err.println("Finalizado");
          break;
        case 2:
          clientesGasolina += num - 1;
          System.err.println("Finalizado");
          break;
        case 3:
          clientesDiesel += num - 2;
          System.err.println("Finalizado");
          break;       
        default:
          System.err.println("Você digitou um número errado");
          System.err.println();
          System.out.println("Digite novamente: ");
          break;
      }
      System.err.print("Digite uma nova opção: ");
      num = sc.nextInt();   
    }
    System.err.println("muito obrigado");
    System.err.println();
    System.out.printf(" Álcool: %d%n Gasolina: %d%n Diesel: %d%n", clientesAlcool, clientesDiesel, clientesGasolina);
    sc.close();
  }
}
