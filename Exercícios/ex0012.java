package Exercícios;
import java.util.Scanner;
public class ex0012 {
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante, valor;
    int quantidade, codigo;



    cachorroQuente = 1;
    xSalada = 2;
    xBacon = 3;
    torradaSimples = 4;
    refrigerante = 5;
    
    System.err.println("Digite o Código:");
    codigo = sc.nextInt();
    System.err.println("Digite a Quantidade:");
    quantidade = sc.nextInt();


    if(codigo == 1){

      valor = quantidade * 4.00;
      System.err.printf("Total: R$ %.2f%n",valor );
    }
    else if(codigo == 2){

      valor = quantidade * 4.50;
      System.err.printf("Total: R$ %.2f%n",valor );
    }
    else if(codigo == 3){

      valor = quantidade * 5.00;
      System.err.printf("Total: R$ %.2f%n",valor );
    }
    else if(codigo == 4){

      valor = quantidade * 2.00;
      System.err.printf("Total: R$ %.2f%n",valor );
    }
    else if(codigo == 5){

      valor = quantidade * 1.50;
      System.err.printf("Total: R$ %.2f%n",valor );
    }




    sc.close();
  }

  
}
