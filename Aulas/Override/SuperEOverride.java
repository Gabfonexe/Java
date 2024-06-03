package Aulas.Override;

import Aulas.Heranca.HerançaClasePrincipal;

public class SuperEOverride extends HerançaClasePrincipal {
  /* EXplicação da utilização do método super e override */

    private Double saldo;

  //super é utilizado para resgatar métodos da superclasse, onde pode ser usado para localizar esses métódos, instanciar e também, modificar atraves do override.

  //exemplo:

  public SuperEOverride(){

  }

  public SuperEOverride (Integer numero, String titular, Double saldo, Double saldo2 ){
    super(numero, titular, saldo);
    this.saldo = saldo2;
  }

  @Override // sobrescrevendo o método da super classe
  public void saque(double quantia){
    super.saque(quantia); // utilizando o próprio método da superclass 
    saldo -= 10.0; // inrementando +1 método 
  }

  
}
