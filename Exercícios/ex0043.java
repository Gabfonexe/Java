package Exercícios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Funcionario;

public class ex0043 {
/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada. */


  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    List<Funcionario> lista = new ArrayList<>();

    int id, num, numAumento;
    String nome;
    double salario;

    System.out.println("Quantos funcionários irão ser registrados? ");
    num = sc.nextInt();
    
    for(int i=0; i < num; i++){

      System.out.printf("Funcionário #%d: %n", i + 1);
      System.out.print("ID: ");
      id = sc.nextInt();
      System.out.print("Name: ");
      nome = sc.next();
      System.out.print("Salário: ");
      salario = sc.nextDouble();
      Funcionario funcionario = new Funcionario(id, nome, salario);
      lista.add(funcionario);
    }
    System.out.print("Digite o funcionário que receberá o aumento: ");
    numAumento = sc.nextInt();

    Funcionario funcionario = lista.stream().filter(x -> x.getId() == numAumento).findFirst().orElse(null);

    if (numAumento  == 2 ){

    }
    System.out.println("lista dos Funcionários: ");




// usar o for each
  }  
}
