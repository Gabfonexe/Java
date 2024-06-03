package Exercícios;
import java.util.Scanner;

public class ex0024 {
//Ler um número inteiro N e calcular todos os seus divisores.


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Número:");
    num = sc.nextInt();

    for (int i=1; num>=i ; i++){

      
      if (num % i == 0){

        System.err.println(i);
      }

    }
    sc.close();
  }
  
}
