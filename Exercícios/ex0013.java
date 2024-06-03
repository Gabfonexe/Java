package Exercícios;
import java.util.Scanner;
public class ex0013 {
//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dosseguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

  double num;

  System.out.println("Digite o número:");
  num = sc.nextDouble();

  if ( num <= 50 && num > 25){
    System.out.println("Intervalo (25,50]");
  }
  else if ( num <= 25 && num >= 0){
    System.out.println("Intervalo [0,25]");
  }
  else if ( num <= 75 && num > 50){
    System.out.println("Intervalo (50,75]");
  }
  else if ( num <= 100 && num > 75){
    System.out.println("Intervalo (75,100]");
  }
  else {
    System.out.println("Fora de Intervalo");
  }

  sc.close();
  }
  
}
