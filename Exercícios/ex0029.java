package Exercícios;
import java.util.Scanner;

import Entities.ConverterDollar.Converter_Dollar;
public class ex0029 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do dollar: ");
    double cotacao = sc.nextDouble();

    System.out.println("quantos dolares você irá comprar?");
    double dolares = sc.nextDouble();

    System.out.printf("Preço do dolar: R$ %.2f%n", cotacao);
    System.out.printf("Quantos dolares irá comprar: R$ %.2f%n", dolares);
    System.out.printf("Dinheiro com taxa e convertido: $ %.2f", Converter_Dollar.converterDollar(cotacao, dolares));
    
    sc.close();
  }
  
}
