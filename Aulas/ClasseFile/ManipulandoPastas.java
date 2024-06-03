package Aulas.ClasseFile;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
  /* Manipular pastas, criar pastas, acessar pastas e/ou arquivos */

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o caminho da pasta: ");
    String strcaminho = sc.nextLine();

    File caminho = new File(strcaminho);

    // mostra as pastas do camingo especificado
    File[] pastas = caminho.listFiles(File::isDirectory);
    System.out.println("Pastas: ");
    for(File pasta : pastas){
      System.out.println(pasta);
    }

    // mostra os arquivos de cada pasta do camingo especificado
    File[] arquivos = caminho.listFiles(File::isFile);
    System.out.println("Arquivos: ");
    for (File arquivo : arquivos){
      System.out.println(arquivo);
    }

    // cria uma pasta 
    boolean sucesso = new File(strcaminho + "\\subpasta").mkdir();
    System.out.println("Diretório criado com sucesso: " + sucesso);


    sc.close();
  }
}
