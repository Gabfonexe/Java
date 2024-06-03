package Aulas.EntradaDados;

import java.util.Scanner;

public class Entrada_De_Dados2 {
  // Para ler um texto até a quebra de linha 

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt(); // quando usa comando de leitura diferente do nextLine(), essa quebra de linha fica pendente na entrada padrão.
    sc.nextLine(); // consome a quebra de linha anterior, ou seja, o s1 poderá ficar correto.
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("Dados Digitados:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();

  }

}
