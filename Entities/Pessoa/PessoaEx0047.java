package Entities.Pessoa;

public abstract class PessoaEx0047 {

  private String nome;
  private Double rendaAnual;

  public PessoaEx0047(){ 
  }

  public PessoaEx0047(String nome, Double rendaAnual){
    this.nome = nome;
    this.rendaAnual = rendaAnual;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Double getRendaAnual(){
    return rendaAnual;
  }

  public void setRendaAnual(Double rendaAnual){
    this.rendaAnual = rendaAnual;
  }

  public abstract Double taxa();
  
}
