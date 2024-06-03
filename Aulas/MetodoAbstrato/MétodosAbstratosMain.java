package Aulas.MetodoAbstrato;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import Enum.Cor;

public class MétodosAbstratosMain {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    //fazer lista da super class 
    List <MétodosAbstratosArea> lista = new ArrayList<>();

    System.out.print("Digite o número de areas: ");
    int n = sc.nextInt();

    for(int i=1; i<= n; i++){
      System.out.println("Dados Area #" + i);
      System.out.print("Retângulo ou Círculo (r/c) ?  ");
      char c = sc.next().charAt(0);
      System.out.print("Cor (BLACK/BLUE/RED): ");
      Cor cor = Cor.valueOf(sc.next());
      if (c == 'r'){
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Largura: ");
        double largura = sc.nextDouble();
        lista.add(new MétodoAbstratoRetangulo(cor, altura, largura));
      } 
      if (c == 'c'){
        System.out.print("Raio: ");
        double raio = sc.nextDouble();
        lista.add(new MétodoAbstratoCirculo(cor,raio));
      }

    }
    System.out.println("Areas: ");
    for (MétodosAbstratosArea areas : lista){
      System.out.println(areas.area());
    }

    sc.close();
  }
  
}
