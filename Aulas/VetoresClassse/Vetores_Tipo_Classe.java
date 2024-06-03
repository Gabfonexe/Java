package Aulas.VetoresClassse;
import Entities.Vetor;
import java.util.Scanner;
import java.util.Locale;

public class Vetores_Tipo_Classe {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho da lista:");
    int n = sc.nextInt();
    Vetor[] vetor = new Vetor[n];

    for (int i=0; i < vetor.length; i++){
      sc.nextLine(); // para consumir a linha, pois tem um nextint atras
      String nome = sc.nextLine();
      double preco = sc.nextDouble();
      vetor[i] = new Vetor(nome, preco);
    }
    double soma = 0.0;
    for (int i=0; i < vetor.length; i++){
      soma += vetor[i].getPreco();
    }
    double valores = soma / vetor.length;

    System.out.printf("Média dos preços: %.2f%n", valores);

    sc.close();
  }
}
