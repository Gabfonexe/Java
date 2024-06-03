package Entities;

import java.io.BufferedReader;
import java.io.FileReader;


public  class LerArquivoEx49 {

  private String caminho;
  
  public LerArquivoEx49(){
  }

  public LerArquivoEx49(String caminho){
    this.caminho = caminho;
  }

  public String getCaminho(){
    return caminho;
  }

  public void setCaminho(String caminho){
    this.caminho = caminho;
  }

  public void lerArquivo(String caminho){

    try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
      String linha = br.readLine();
  
      while(linha != null){
        System.out.println(linha);
        linha = br.readLine();
      }
    }

    catch (Exception e){
      System.out.println("Erro: " + e.getMessage());
    }

  }
  

  
}
