package DesignPatterns;

public class Robo {

  private Comportamento comportamento; //isso é a strategy
  
  public void setComportamento(Comportamento comportamento){
    this.comportamento = comportamento;
  }

  public void mover(){
    comportamento.mover();
    
  }
}
