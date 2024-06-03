package Aulas.Funcoes;
import java.util.Scanner;

public class Funções_Sintaxe {
  public static void main(String[] args) { // função padrão de execução
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter three numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = max (a,b,c);

    showResult(higher);

    sc.close();
  }

  public static int max (int x, int y, int z) { // criando uma função com retorno
    int aux;
    if (x > y && x > z){
      aux = x;
    }
    else if (y > z){
      aux = y;
    }
    else{
      aux = z;
    }
    return aux;

  }

  public static void showResult(int value){ // criando função sem retorno
    System.out.println("Higher = " + value);
  }
  
}
