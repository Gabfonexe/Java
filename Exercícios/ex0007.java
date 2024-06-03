package Exercícios;
import java.util.Scanner;
import java.util.Locale;

public class ex0007 {
// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
//a) a área do triângulo retângulo que tem A por base e C por altura. 
//b) a área do círculo de raio C. (pi = 3.14159) 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double A, B, C;
    double areaTriangulo, areaCirculo, areaTrapazeio, areaQuadrado, areaRetangulo;
    double pi = 3.14159;

    System.err.print("Lado A: ");
    A = sc.nextDouble();
    System.err.print("Lado B: ");
    B = sc.nextDouble();
    System.err.print("Lado C: ");
    C = sc.nextDouble();
    System.out.println();

    areaTriangulo = (A * C)/2;
    areaCirculo = pi * Math.pow(C, 2.0);
    areaTrapazeio = (A + B * C)/2;
    areaQuadrado = Math.pow(B,2.0);
    areaRetangulo = A * B;

    System.err.printf("Triângulo: %.3f%n", areaTriangulo);
    System.err.printf("Círculo: %.3f%n",areaCirculo);
    System.err.printf("Trapézio: %.3f%n", areaTrapazeio);
    System.err.printf("Quadrado: %.3f%n", areaQuadrado);
    System.err.printf("Retângulo: %.3f%n", areaRetangulo);
    System.err.println();

    sc.close();
  }
}
