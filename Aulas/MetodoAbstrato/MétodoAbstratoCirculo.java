package Aulas.MetodoAbstrato;
import Enum.Cor;

public class MétodoAbstratoCirculo extends MétodosAbstratosArea {
  // precisa instanciar o método abstract 
  private Double raio;

  public MétodoAbstratoCirculo(){
    super();
  }

  public MétodoAbstratoCirculo(Cor cor, Double raio){
    super(cor);
    this.raio = raio;
  }

  public Double getRaio() {
    return raio;
  }

  public void setRaio(Double raio) {
    this.raio = raio;
  }

  @Override
  public double area(){
    return 3.14 * Math.pow(raio, 2);
  }

  


  
}
