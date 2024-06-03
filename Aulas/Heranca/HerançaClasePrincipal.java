package Aulas.Heranca;

public class HerançaClasePrincipal {

  private Integer numero;
  private String titular;
  protected Double saldo;

  public HerançaClasePrincipal(){

  }

  public HerançaClasePrincipal(Integer numero, String titular, Double saldo){
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;

  }

  public Integer getNumero(){
    return numero;
  }

  public void setNumero(Integer numero){
    this.numero = numero;
  }

  public String getTitular(){
    return titular;
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public Double getSaldo(){
    return saldo;
  }

  // o saldo não pode ter metodo set

  public void saque(double quantia){
    saldo -= quantia;
  }
  
  public void deposito(double quantia){
    saldo += quantia;
  }

}
