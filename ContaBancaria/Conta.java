package ContaBancaria;

public class Conta {
  
  private int numero;
  private String agencia;
  private String nomeCliente;
  private Double saldo;

  public Conta(int numero, String  agencia, String nomeCliente, Double saldo){
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.numero = numero;
    this.saldo = saldo;
  }

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public String getAgencia(){
    return agencia;
  }

  public void setAgencia(String agencia){
    this.agencia = agencia;
  }

  public String getNomeCliente(){
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }

  public Double getSaldo(){
    return saldo;
  }

  public void setSaldo(Double saldo){
    this.saldo = saldo;
  }


  @Override
  public String toString(){
    return "Cliente: " + nomeCliente + "\n"  +
     "Conta: " + numero  + "\n"  +
     "Agência: " + agencia  + "\n"  +
     "Saldo: " + saldo  + "\n";
  }
}
