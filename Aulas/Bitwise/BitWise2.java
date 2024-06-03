package Aulas.Bitwise;
import java.util.Scanner;

public class BitWise2 {
// testando bit

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int mask = 0b100000;
    int n = sc.nextInt();

    if ((n & mask) != 0){ // UTILIZADO PRA TESTAR SE O BIT É 1 (VERDADEIRO)
      System.out.println("6th bit is ture!");
    }
    else{
      System.out.println("6th bit is false!");
    }
    sc.close();
  }
  
}
