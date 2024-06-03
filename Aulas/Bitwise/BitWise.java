package Aulas.Bitwise;

public class BitWise {
// operações de bit a bit
// & -> compara bit a bit se os dois são falsos ou verdadeiros
// | -> compara bit a bit se um é falso ou um é verdadeiro
// ^ -> compara bit a bit de forma exclusiva o método ou. Ou seja, se for V e V, será falso.
  public static void main(String[] args) {
    
    int n1 = 89; // 0101 1001 
    int n2 = 60; // 0011 1100
    // compara bit a bit, da direira pra esquerda
    System.out.println(n1 & n2); // 0001 1000 (24)
    System.out.println(n1 | n2); // 0111 1101 (125)
    System.out.println(n1 ^ n2); // 0110 0101 (101)
    
  }
  
}
