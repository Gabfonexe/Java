package Exercícios;
import java.util.Scanner;
import java.util.Locale;

public class ex0006 {
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int qtd_Peca1, qtd_Peca2, cod_Peca1, cod_Peca2;
    double valor_Peca1, valor_Peca2, valor_Total;

    System.out.print("código peça 1 : ");
    cod_Peca1 = sc.nextInt();
    System.out.print("código peça 2 : ");
    cod_Peca2 = sc.nextInt();
    System.out.print("Quantidade da peça 1 em unidades: ");
    qtd_Peca1 = sc.nextInt();
    System.out.print("Quantidade da peça 2 em unidades: ");
    qtd_Peca2 = sc.nextInt();
    System.out.print("Valor unitário da peça 1: ");
    valor_Peca1 = sc.nextDouble();
    System.out.print("Valor unitário da peça 2: ");
    valor_Peca2 = sc.nextDouble();
    System.err.println();
    valor_Total = qtd_Peca1 * valor_Peca1 + qtd_Peca2 * valor_Peca2;

    System.out.printf("Valor a Pagar: R$ %.2f", valor_Total);
    

    sc.close();
  }

}
