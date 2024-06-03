package Exercícios;
import java.util.Scanner;
import java.util.Locale;

public class ex0022 {
//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double num, var1, var2;
    double divisao;
    System.err.print("Digite o valor: ");
    num = sc.nextDouble();
    var1 = 0;


    for (int i=0; num > i; i++){

      System.err.println("Digite 2 valores com espaço entre eles: ");
      var1 = sc.nextDouble();
      var2 = sc.nextDouble();
      divisao = var1 / var2;
      if (divisao == 0.0){
        System.out.println("Divisão impossível");
      }
      else{
        System.out.printf("valor da divisão: %.2f%n", divisao);
      }

    }
    
    sc.close();
  }
  
}
