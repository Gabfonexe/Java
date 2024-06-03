package Aulas.MetodoAbstrato;

import Enum.Cor;

public abstract class MétodosAbstratosArea {

  // São métodos que não possuem implementação
  // Métodos precisam ser abstratos quando a classe é genérica demais para conter
  // sua implementação
  // se uma classe possuir pelo menos um método abstrato, então esta classe será
  // abstrata
  // notação UML: itálico

  private Cor cor;

  public MétodosAbstratosArea() {
  }

  public MétodosAbstratosArea(Cor cor) {
    this.cor = cor;
  }

  public Cor getColor() {
    return cor;
  }

  public void setCor(Cor cor) {
    this.cor = cor;
  }
  
  public abstract double area();  // método abstrato
}
