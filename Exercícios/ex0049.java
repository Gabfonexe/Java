package Exercícios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.LerArquivoEx49;

public class ex0049 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o caminho: ");
    String caminho = sc.nextLine();
    LerArquivoEx49 ler = new LerArquivoEx49(caminho); 
    List <LerArquivoEx49> lista = new ArrayList<>();

    lista.add(ler);

    ler.lerArquivo(caminho);

    

    

    
    


//C:\Users\bielf\OneDrive\AreadeTrabalho\Curso-Java-Scripts\Exercicios
// C:\Users\bielf\Downloads
// C:\Users\bielf\OneDrive\Área de Trabalho

/* 
Camiseta,25.00,100
Calça Jeans,50.00,50
Tênis,80.00,30
Bermuda,35.00,80
Blusa de Moletom,45.00,60
Sapato Social,120.00,20
Vestido,60.00,40
Jaqueta de Couro,150.00,15
Boné,20.00,75
Meias,8.00,200 
*/





    sc.close();
    
  }

  
  
}
