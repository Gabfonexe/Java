package Aulas.EntradaDados;
import java.util.Locale;
import java.util.Scanner;
public class Entrada_De_Dados1 {

  // Para fazer entrada de dados no java, devemos chamar o
  // Scanner -> Scanner sc = new Scanner(System.in)
  // sc.close() -> desabilita o recurso da variável sc
  
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next(); // Irá guardar o próximo valor digitado
    System.out.println("Você Digitou: " + x);

    int y;
    y = sc.nextInt(); 
    System.out.println("Você Digitou: " + y);

    double z;
    z = sc.nextDouble();
    System.out.printf("Você digitou: %.2f%n", z);

    char w;
    w = sc.next().charAt(0); // pega a primeira string
    System.out.println("Você digitou: " + w);

    // Lendo várias entradas de uma vez separados por espaços
    String a;
    int b;
    double c;
    a = sc.next();
    b = sc.nextInt();
    c = sc.nextDouble();
    System.out.println("Dados Digitados:");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    sc.close();
  }
}
