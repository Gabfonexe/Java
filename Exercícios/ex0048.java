package Exercícios;

import java.util.Locale;
import java.util.Scanner;

import Exception.DomainException;

public class ex0048 {

  private Integer numero;
  private String titular;
  private Double saldo;
  private Double limiteSaque;

  public ex0048(){
  }

  public ex0048(Integer numero, String titular, Double saldo, Double limiteSaque) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
    this.limiteSaque = limiteSaque;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Double getSaldo() {
    return saldo;
  }

  public Double getLimiteSaque() {
    return limiteSaque;
  }

  public void deposito(Double deposito){
    this.saldo += deposito;
  }

  public void saque(Double saque){
    validaçaosaque(0);
    this.saldo -= saque;
  }

  private void validaçaosaque(double quantia){
    if (quantia > getLimiteSaque()){
      throw new DomainException("Erro de saque: A quantia excede o limite de saque");
    }
    if (quantia > getSaldo()){
      throw new DomainException("Erro de saque: Saldo insuficiente");
    }
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    System.out.print("Digite os dados da conta: ");
    System.out.print("Número: ");
    int numero = sc.nextInt();
    System.out.print("Titular: ");
    sc.nextLine();
    String titular = sc.nextLine();
    System.out.print("Saldo Inicial: ");
    Double saldoInicial = sc.nextDouble();
    System.out.print("Limite de Saque: ");
    Double limiteSaque = sc.nextDouble();

    ex0048 conta = new ex0048(numero, titular, saldoInicial, limiteSaque);

    System.out.println();
    System.out.print("Informe uma quantia para sacar: ");
    double quantia = sc.nextDouble();

    try {
      conta.saque(quantia);
      System.out.printf("Novo saldo %.2f%n", conta.getSaldo());
    }
    catch (DomainException e){
      System.out.println(e.getMessage());
    }


    

    sc.close();
  }
 
  
}
