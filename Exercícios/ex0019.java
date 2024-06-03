package Exercícios;
import java.util.Scanner;

public class ex0019 {
//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x;

    System.err.print("X = ");
    x = sc.nextInt();
    System.err.println();

    for (int i=1; x>=i && x <= 1000 ; i+=2){

      System.err.println(i);
    } 
    sc.close();
    
  }
}
