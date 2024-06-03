package Aulas.EstruturaRepeticao;
import java.util.Scanner;
public class While {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int x, soma;
    soma = 0;
    System.out.print("Escreva o número: ");
    x = sc.nextInt();

    while (x != 0){

      soma = soma + x; // poderia ser: soma += x.
      System.err.println();
      System.out.print("Escreva outro número: ");
      x = sc.nextInt();
    }
    System.out.println(soma);

    sc.close();
  }
  
}
