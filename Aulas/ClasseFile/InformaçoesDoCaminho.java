package Aulas.ClasseFile;

import java.io.File;
import java.util.Scanner;

public class InformaçoesDoCaminho {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String strcaminho = sc.nextLine();
    
    File caminho = new File(strcaminho);

    System.out.println("getName: " + caminho.getName());
    System.out.println("getParent: " + caminho.getParent());
    System.out.println("getCaminho: " + caminho.getPath());

    sc.close();

  }
  
}
