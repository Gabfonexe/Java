package Aulas.ListaMatrizes;
import java.util.Scanner;

public class Matrizes {
/* Basta criar um for dentro de um for */
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n, m;

    System.out.println("Digite a quantidade de linhas: ");
    n = sc.nextInt();
    System.out.println("Digite a quantidade de colunas: ");
    m = sc.nextInt();

    int [][] matriz = new int [n][m];

    for(int i=0; i < matriz.length; i++){
      for (int j=0; j < matriz[i].length; j++){
        matriz[n][m] = sc.nextInt();
      }
    }
    int x = sc.nextInt();

    for (int i=0; i < matriz.length; i++ ){
      for (int j=0; j < matriz[i].length; j++){
        if (matriz[i][j] == x){
          System.out.println("Posição " + i + "," + j + ":");
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
      sc.close();
    }


  }
  
}
