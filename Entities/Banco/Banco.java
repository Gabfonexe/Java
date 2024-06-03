package Entities.Banco;

public class Banco {

  private int conta; // NÃO MUDA
  private String nome; // POSSO MUDAR
  private double valor; // MUDA SOMENTE POR MÉTODO SAQUE E DEPOSITO

  public int getConta() {
    return conta;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getValor() {
    return valor;
  }

  public Banco(int conta, String nome) { // IF (NAO P/ DEPOSITO INICIAL)
    this.conta = conta;
    this.nome = nome;
  }

  public Banco(int conta, String nome, double depositoInicial) { //IF (SIM P/ DEPOSITO INICIAL)
    this.conta = conta;
    this.nome = nome;
    deposito(depositoInicial);
  }

  public String toString(){
    return "teste";
  }
  
  public void deposito(double valor){
    this.valor += valor;
  }

  public void saque(double valor){
    this.valor -= (valor + 5.0);
  }

  

  
}
