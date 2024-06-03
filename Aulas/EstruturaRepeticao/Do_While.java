package Aulas.EstruturaRepeticao;
import java.util.Scanner;
import java.util.Locale;

public class Do_While {
// o do-while promete que uma sentença seja lida antes de entrar no while
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    char resp;
    do {
      System.out.print("Digite a temperatura em Celsius: ");
      double C = sc.nextDouble();
      double F = 9.0 * C / 5.0 + 32.0;
      System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
      System.out.println("Deseja repetir (S/N)? ");
      resp = sc.next().charAt(0);

    } while (resp != 'n');

    sc.close();

  }

}
