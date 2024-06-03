package Exercícios;
import java.util.Scanner;

import Entities.Banco.Banco;
public class ex0030 {


/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo). Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa. Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.*/


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Banco banco; // não instancio a banco pois ele ficaria preso em algum escopo. (if ou else)
    
    System.out.println("Digite o número da conta: ");
    int conta =  sc.nextInt();
    System.err.println("Digite seu nome: ");
    sc.nextLine();
    String nome = sc.nextLine();
    System.out.println("Deseja fazer depósito inicial? ");
    char resposta = sc.next().charAt(0) ;

    if (resposta == 'n' || resposta == 'N'){
      banco = new Banco(conta, nome);
    }
    else if (resposta == 's' || resposta == 'S'){

      System.out.println("Digite o depósito inicial: ");
      double depositoInicial = sc.nextDouble();
      banco = new Banco(conta, nome, depositoInicial);
    }
    //banco = new Banco();
    System.out.println("Dados da Conta:");
    //System.out.println(banco);
    System.out.println();





    

    



    //banco.bancoDeposito(valor);
    //banco.bancoSaque(valor);
      
    

    

    



    


    
    sc.close();
  }






}
