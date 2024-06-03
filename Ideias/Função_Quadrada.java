package Ideias;
import java.util.Scanner;
public class Função_Quadrada {
  //criar um algoritimo para funções quadradas

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3;
    System.out.println("Digite o valor de A: ");
    num1 = sc.nextInt();
    System.out.println("Digite o valor de B: ");
    num2 = sc.nextInt();
    System.out.println("Digite o valor de C: ");
    num3 = sc.nextInt();
    System.out.printf("Função: (%dX)² + (%dX) + (%d)%n",num1, num2, num3);

    double quadrado = Math.pow(num2, 2.0);
    double delta = quadrado - 4*num1*num3;
    System.out.println("Delta = " + delta);

    double raiz = Math.sqrt(delta);
    if (delta< 0){

      System.err.println("não existem raízes reais");
    }
    else if (delta == 0){

      System.err.println("existe uma raíz real");
      double x1 = -num2 + raiz/(2+num1);
      double x2 = -num2 - raiz/(2+num1);
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);

    }
    else if (delta > 0){

      System.err.println("existem duas raízes reais");
      double x1 = -num2 + raiz/(2+num1);
      double x2 = -num2 - raiz/(2+num1);
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);


    }
  











    sc.close();
  }

}
