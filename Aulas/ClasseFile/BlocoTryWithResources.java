package Aulas.ClasseFile;
/*Bloco que abre e fecha automaticamente as streams */

import java.io.BufferedReader;
import java.io.FileReader;

public class BlocoTryWithResources {
  // a apartir do java 7 tem essa funcionalidade
  public static void main(String[] args) {

    String caminho = "";
        
    try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
      String linha = br.readLine();

      while(linha != null){
        System.out.println(linha);
        linha = br.readLine();
      }
    }
    catch (Exception e) {
      System.out.println("ErrO : " + e.getMessage());
      
    }
  }
}
