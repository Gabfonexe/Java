package Exercícios;
import java.util.Scanner;
public class ex0014 {
// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadasde um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  double x, y;

  System.out.print("X: ");
  x = sc.nextDouble();
  System.out.print("Y: ");
  y = sc.nextDouble();

  if (x == 0 && y == 0){
    System.err.println();
    System.out.println("Origem");
    System.err.println();
  }
  else if (x > 0 && y > 0){
    System.err.println();
    System.out.println("Q1");
    System.err.println();
  }
  else if (x > 0 && y < 0){
    System.err.println();
    System.out.println("Q4");
    System.err.println();
  }
  else if (x < 0 && y > 0){
    System.err.println();
    System.out.println("Q2");
    System.err.println();
  }
  else if (x < 0 && y < 0){
    System.err.println();
    System.out.println("Q3");
    System.err.println();
  }


  sc.close();
}
 
}
