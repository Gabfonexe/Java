package Aulas.ClasseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

  public static void main(String[] args) {
    
    String pasta = " ";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      // ler o aruivo com o bufferedreader
      fr = new FileReader(pasta);
      br = new BufferedReader(fr);

      String line = br.readLine();

      while(line != null){
        System.out.println(line);
        line = br.readLine();
      }
    }
    catch(IOException e){
      System.out.println("Erro: " + e.getMessage());
    }
    finally{
      try{
        if (br != null){
          br.close();
        }
        if(fr != null){
          fr.close();
        }
      }
      catch (IOException e){
        e.printStackTrace();
    }
    
    }
  }
  
}
