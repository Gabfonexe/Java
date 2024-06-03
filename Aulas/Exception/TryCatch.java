package Aulas.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    try {
      String[] vetor = sc.nextLine().split(" ");
      int posicao = sc.nextInt();
      System.out.println(vetor[posicao]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Posição Inválida");
    }
    catch(InputMismatchException e){
      System.out.println("Você não digitou um número");
    }
    System.out.println("Fim do Programa");

    sc.close();
  }
  
}
