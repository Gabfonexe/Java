package Exercícios;
import java.util.Locale;
import java.util.Scanner;
import Entities.Rectangle;

public class ex0026 {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Rectangle retangulo = new Rectangle();
    Locale.setDefault(Locale.US);

    System.err.println("Digite a largura e altura do Retângulo: ");
    retangulo.largura = sc.nextDouble();
    retangulo.altura = sc.nextDouble();

    double area = retangulo.areaRetangulo();
    double perimetro = retangulo.perimetroRetangulo();
    double diagonal = retangulo.diagonalRetangulo();

    System.out.printf("ÁREA = %.2f%n", area );
    System.out.printf("PERÍMETRO = %.2f%n", perimetro );
    System.out.printf("DIAGONAL = %.2f%n", diagonal );

    sc.close();
  }
  
}
