package Entities;

public class Employee {

  public String nome;
  public double salarioBruto;
  public double taxa;

  public double salarioLiquido(){

    double liquido = salarioBruto - taxa;
    return liquido;
  }

  public void salarioAumento (double salarioBruto){

    this.salarioBruto += salarioBruto * this.salarioBruto;
  }

  public String toString(){

    return "Funcionário: "
    + nome
    + ", $ "
    + salarioBruto;
  }
  
}
