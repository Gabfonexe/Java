package Exercícios;
import java.util.Scanner;

public class ex0010 {
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao saoMultiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int A, B;

    System.err.println("Número 1:");
    A = sc.nextInt();
    System.err.println("Número 2:");
    B = sc.nextInt();
    if(A > B){

      int var1 = A%B;
      if (var1 == 0){
        System.err.println("São Múltiplos");
      }
      else {
        System.out.println("Não são múltiplos");
      }
    }
    else if (B > A){
      int var2 = B%A;
      if (var2 == 0){
        System.err.println("São Múltiplos");
      }
      else {
        System.out.println("Não são múltiplos");
      }
    }
    else{
      System.out.println("Você não digitou um número");

    }






    sc.close();
  }

  
}
