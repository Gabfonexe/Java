package Aulas.SaidaDados;
import java.util.Locale;
public class Saida_De_Dados {

  public static void main(String[] args) {

    double x = 10.35784;
    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;

    System.out.println(x);
    System.out.printf("%.2f%n", x);// %n para quebrar linhas
    System.out.printf("%.4f%n", x);
    Locale.setDefault(Locale.US);// Mudou a localização para os Eua
    System.out.printf("%.4f%n", x);// agora tem o ponto e não vírgula
    System.out.println("Resultado = " + x + " Metros");
    System.out.printf("Resultado = %.2f Metros%n", x );
    System.out.printf("%s tem %d anos e ganha %.2f Reais%n", nome, idade, renda );

    


   


  } 

}