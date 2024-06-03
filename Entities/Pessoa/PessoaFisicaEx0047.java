package Entities.Pessoa;

public class PessoaFisicaEx0047 extends PessoaEx0047 {

  private Double gastoSaude;

  
  public PessoaFisicaEx0047() {
    super();
  }

  public PessoaFisicaEx0047(String nome, Double rendaAnual, Double gastoSaude) {
    super(nome, rendaAnual);
    this.gastoSaude = gastoSaude;
  }

  public Double getGastoSaude() {
    return gastoSaude;
  }

  public void setGastoSaude(Double gastoSaude) {
    this.gastoSaude = gastoSaude;
  }

  @Override
  public Double taxa(){
    Double imposto = 0.0;
    Double resultadoimposto = 0.0;

    if (super.getRendaAnual() < 20000){
      imposto = getRendaAnual() * 0.15;
      double desconto = getGastoSaude() / 2;
      resultadoimposto = imposto - desconto;
      return resultadoimposto;
    }

    imposto = getRendaAnual() * 0.25;
    double desconto = getGastoSaude() / 2;
    resultadoimposto = imposto - desconto;
    
    return resultadoimposto;
  }
  
}
