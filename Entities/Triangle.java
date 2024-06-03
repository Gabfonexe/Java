package Entities;

public class Triangle {
  
  public double a;
  public double b;
  public double c;

  /* a função area() fica com argumentos vazios pois os lados do Triãngulo, estão na classe acima e por isso, por estar na mesma classe, não precisa instanciar */

  public double area(){//criando um método (função da área)

    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
  
}
