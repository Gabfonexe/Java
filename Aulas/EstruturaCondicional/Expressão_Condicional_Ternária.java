package Aulas.EstruturaCondicional;

public class Expressão_Condicional_Ternária {
  // uma alternativa para if else

  public static void main(String[] args) {
    
    // if else

    double preco = 34.5;
    double desconto;
    if (preco < 20.0){
      desconto = preco * 0.1;
    }
    else{
      desconto = preco * 0.05;
    }
    System.err.println(preco);
    System.err.println(desconto);

    // usando expressão ternária

    double preco2 = 34.5;
    double desconto2 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
    System.err.println(preco2);
    System.err.println(desconto2);

  }
}
