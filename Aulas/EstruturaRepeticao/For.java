package Aulas.EstruturaRepeticao;
import java.util.Scanner;
public class For {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int soma = 0;
    for (int i = 0; i<N; i++){ // o i++ significa que o o I está recebendo ele mesmo + 1.

      int x = sc.nextInt();
      soma = soma + x; //soma +=x != soma = soma + x 

    }
    System.err.println(soma);
    sc.close();
  }
}
