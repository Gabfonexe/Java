package Aulas.ProcessamentoDados;

public class Processamento_De_Dados {
  // Utilização do Casting
  // Casting = conversão explícita dos tipos de dados
  public static void main(String[] args) {

    int a, b;
    double resultado;

    a = 5;
    b = 2;

    resultado = (double) a / b; // usa o (double) para p resultado ser de forma exata : 2,5.
    // Esse método é chamado de casting
    System.err.println(resultado);

    // outro exemplo de casting para evitar erro

    double x;
    int y;

    x = 5.0;
    y = (int) x;

    System.out.println(y);
  }
}
