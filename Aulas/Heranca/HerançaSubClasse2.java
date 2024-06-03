package Aulas.Heranca;

public class HerançaSubClasse2 extends HerançaClasePrincipal{
  
  private Double taxadeJuros;

  public HerançaSubClasse2(){
    super();
  }

  public HerançaSubClasse2(Integer numero, String titular, Double saldo, Double taxadejuros) {
    super(numero, titular, saldo);
    this.taxadeJuros = taxadejuros;
  }

  public Double getTaxaDejuros(){
    return taxadeJuros;
  }

  public void setTaxaDeJuros(Double taxadejuros){
    this.taxadeJuros = taxadejuros;
  }

  public void updateSaldo(){
    saldo += saldo * taxadeJuros;
  }


  
}
