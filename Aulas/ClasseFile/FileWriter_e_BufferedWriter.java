package Aulas.ClasseFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {
  /* new FileWriter(path) -> criar ou recriar um arquivo
   * new FileWriter(path, true) -> acrescenta ao arquivo existente
   */

   public static void main(String[] args) {
    
    String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

    String caminho = "C:\\Users\\bielf\\OneDrive\\Área de Trabalho\\listajava";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
      for (String linha : linhas){
        bw.write(linha);
        bw.newLine();

      }
    }
    catch (IOException e){
      e.printStackTrace();
    }
   }
}
