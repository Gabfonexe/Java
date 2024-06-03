package Aulas.VetoresClassse;
import java.util.Locale;
import java.util.Scanner;

public class Vetores_Tipo_Primitivo {

  // VETORES DO TIPO PRIMITIVO
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho da lista: ");

    int n = sc.nextInt();
    double[] vetor = new double[n];

    for (int i=0; i<n; i++){
      vetor[i] = sc.nextDouble();
    }
    double soma = 0.0;
    for (int i=0; i<n; i++){
      soma += vetor[1];
    }
    double valores = soma / n;

    System.out.printf("a média é: %.2f%n", valores);

    sc.close();
  }




  
}
