package Entities;

public class Rectangle {

  public double altura;
  public double largura;

  public double areaRetangulo(){

    double area = altura * largura;
    return area;
  }

  public double perimetroRetangulo(){

    double perimetro = altura + largura;
    return perimetro;
  }

  public double diagonalRetangulo(){
    // sqrt (base² + altura²)

    double diagonal = Math.sqrt((Math.pow(largura, 2.0) + Math.pow(altura, 2.0)));
    return diagonal;
  }

  
}
