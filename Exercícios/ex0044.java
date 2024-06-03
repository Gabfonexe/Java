package Exercícios;
import java.util.Scanner;

public class ex0044 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int m,n;

    System.out.print("Digite o número de linhas: ");
    m = sc.nextInt();
    System.out.println();
    System.out.print("Digite o número de colunas: ");
    n = sc.nextInt();
    System.out.println();

    int [][] matriz = new int[m][n];

    for (int i=0; i < matriz.length; i++){
      System.out.println("Digite os números da coluna: ");
      for (int j=0; j < matriz[i].length; j++){
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println();
    System.out.print("Digite um número que esteja na matriz: ");
    int x = sc.nextInt();
    System.out.println();
    for (int i=0; i < matriz.length; i++){
      for (int j=0; j < matriz[i].length; j++){

        if (matriz[i][j] == x){

          System.out.print("Posição: " +  i + "," + j + ":");
          System.out.println();
          if (j > 0){
            System.out.println("Esquerda: " + matriz[i][j-1]);
        }
          if (i > 0) {
            System.out.println("em cima: " + matriz[i-1][j]);
        }
          if (j < matriz[i].length-1) {
            System.out.println("Direita: " + matriz[i][j+1]);
        }
          if (i < matriz.length-1) {
            System.out.println("Em baixo: " + matriz[i+1][j]);
        }
          
        }
    
    }
  
  }
  sc.close();
 }
}