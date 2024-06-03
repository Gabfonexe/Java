package Exercícios;
import java.util.Scanner;

import Entities.DadosPessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ex0041 {
/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. 
 */
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int tamanho;
    String genero;
    double altura;

    System.out.println("Quantas Pessoas serão digitadas? ");
    tamanho = sc.nextInt();

    DadosPessoas [] pessoa = new DadosPessoas[tamanho];
    List<DadosPessoas> pessoaList = new ArrayList<>();
    int qtdMulheres = 0;
    double somaAltura = 0;
    
    for (int i=0; i < pessoa.length; i++){

      System.out.printf("Altura da %d° pessoa: ", (i+1));
      altura = sc.nextDouble();
      System.out.printf("Gênero da %d° pessoa: ", (i+1));
      genero = sc.next();
      pessoa[i] = new DadosPessoas(altura, genero);
      pessoaList.add(pessoa[i]);
      if (genero.equalsIgnoreCase("f")){
        qtdMulheres ++;
        somaAltura += altura;
        pessoa[i].setQtdMulheres(qtdMulheres);
        pessoa[i].setSomaAltura(somaAltura);
      }
    }
    for (int i=0; i < pessoa.length; i++){

      System.out.println(pessoa[i].getGenero());

      if (pessoa[i].getGenero() == "f" ){
        qtdMulheres ++;
        double mediaMulheres = pessoa[i].getAltura() / qtdMulheres ;
        System.out.println(mediaMulheres);
      }
    }
    for (DadosPessoas p : pessoa){
      System.out.println(p.getQtdMulheres());
      System.out.println(p.getSomaAltura());
    }
    
    
   // double mediaMulheres = pessoa[i].getAltura() / qtdMulheres ;














    sc.close();
  }











}
