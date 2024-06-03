package Entities.Calculadora;
import java.util.Scanner;
public class Calculo_Funções {

  Scanner sc = new Scanner(System.in);

  public double a;
  public double b;
  public double c;

  public double calcularRaiz(){

    double quadrado =  Math.pow(b, 2.0);
    double delta = quadrado - 4*a*c;

    return Math.sqrt(delta); // raiz

  }

  public double calcularX1(){

    double x1 = -b + calcularRaiz() / 2 * a; // - b + sqrt(delta)/ 2 * a

    return x1;
  }

  public double calcularX2(){

    double x2 = -b - calcularRaiz() / 2 * a; // - b - sqrt(delta)/ 2 * a
    
    return x2;
  }


  
}
