package ContaBancaria;

import java.util.Scanner;

public class ContaTerminal extends Conta{

  public ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
    super(numero, agencia, nomeCliente, saldo);
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu nome:");
    String nome = sc.nextLine();
    System.out.println("Digite o número da sua conta: ");
    int numConta = sc.nextInt();
    System.out.println("Digite a sua agência: ");
    String agencia = sc.next();
    System.out.println("Digite o Saldo: ");
    Double saldo = sc.nextDouble();

    Conta conta = new Conta(numConta, agencia, nome, saldo);

    System.out.println(conta);

    sc.close();
  }
}