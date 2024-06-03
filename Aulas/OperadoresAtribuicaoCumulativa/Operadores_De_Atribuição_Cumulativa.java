package Aulas.OperadoresAtribuicaoCumulativa;
import java.util.Scanner;
import java.util.Locale;
public class Operadores_De_Atribuição_Cumulativa {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int minutos;
    
    System.err.println("Digite o tempo em minutos: ");
    minutos = sc.nextInt();

    double conta = 50.0;
    if (minutos > 100){
      conta = conta + (minutos - 100) * 2.0;
    }
    System.out.printf("Valor da conta = R$ %.2f%n", conta);

    sc.close();
  }
  
}
