package Aulas.Problemas;

import java.util.Scanner;
import java.util.Locale;
import Entities.Triangle;

public class Problema_Triângulo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measures of triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    Double areaX = x.area();
    Double areay = y.area();

    System.out.printf(" Triangle X area: %.4f%n", areaX);
    System.out.printf(" Triangle Y area: %.4f%n", areay);

    if (areaX > areay) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");

    }

    sc.close();

  }

}
