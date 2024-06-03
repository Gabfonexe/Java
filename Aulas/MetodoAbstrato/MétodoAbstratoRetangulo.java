package Aulas.MetodoAbstrato;

import Enum.Cor;

public class MétodoAbstratoRetangulo extends MétodosAbstratosArea{
  // precisa instanciar o método abstract 
  private Double altura;
  private Double largura;


  public MétodoAbstratoRetangulo(Cor cor, Double altura, Double largura) {
    super(cor);
    this.altura = altura;
    this.largura = largura;
  }
  public MétodoAbstratoRetangulo() {
    super();
  }

  public Double getAltura() {
    return altura;
  }
  public void setAltura(Double altura) {
    this.altura = altura;
  }
  public Double getLargura() {
    return largura;
  }
  public void setLargura(Double largura) {
    this.largura = largura;
  }

  @Override
  public double area(){
    return largura * altura;
  }

  

}
