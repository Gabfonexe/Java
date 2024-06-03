package Entities.Aluno;


public class Aluno {

  public String aluno;
  public double _1nota;
  public double _2nota;
  public double _3nota;

  public double notaAluno(){

    double media = (_1nota + _2nota + _3nota ); // this nota += nota + nota + nota
    return media;
  }
  
  
}
