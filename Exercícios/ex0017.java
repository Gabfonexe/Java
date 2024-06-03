package Exercícios;
import java.util.Scanner;
public class ex0017 {
//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int x, y;
    System.err.print("X: ");
    x = sc.nextInt();
    System.out.print("Y: ");
    y = sc.nextInt();
    String resposta;
    resposta = " ";

    //String q1 = (x > 0 && y > 0) ? resposta : "Primeiro";
    //String q2 = (x < 0 && y > 0) ? resposta : "Segundo";
    //String q3 = (x < 0 && y < 0) ? resposta : "Terceiro";
    //String q4 = (x > 0 && y < 0) ? resposta : "Quarto";

    while (x != 0 && y != 0) {


      if (x > 0 && y > 0){
        resposta = "primeiro";
      }
      else if (x < 0 && y > 0){
        resposta = "Segundo";
      }
      else if (x < 0 && y < 0){
        resposta = "Terceiro";
      }
      else if (x > 0 && y < 0){
        resposta = "Quarto";
      }
  
      System.err.println(resposta);
      System.err.print("X: ");
      x = sc.nextInt();
      System.out.print("Y: ");
      y = sc.nextInt();
      
    }

    sc.close();
  }
  
}
