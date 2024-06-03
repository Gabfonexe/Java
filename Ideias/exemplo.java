package Ideias;
import java.util.Scanner;

public class exemplo {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int texto, texto2;
    System.err.printf("Digite o primeiro número: %n");
    texto = sc.nextInt();
    System.err.printf("Digite o primeiro número: %n");
    texto2 = sc.nextInt();

    if (texto > texto2){
      System.out.printf("Número %d é o maior", texto);
    }
    else if (texto < texto2){
      System.out.printf("Número %d é o maior", texto2);
    }
    else{
      System.out.printf("Você não digitou um número");
    }
    sc.close();
  }
}
