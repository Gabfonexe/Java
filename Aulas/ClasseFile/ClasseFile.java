package Aulas.ClasseFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClasseFile {
  
  public static void main(String[] args) {
    
    File file = new File("C:\\Users\\bielf\\OneDrive\\Área de Trabalho");
    Scanner sc = null; // deixo assim para poder deixar instanciado 
    try{
      sc = new Scanner(file);
      while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
      }
    }
    catch (IOException e){
      System.out.println("ERRO: " + e.getMessage());
    }
    finally{
      if(sc != null){
        sc.close();
      }
    }
  }
}
