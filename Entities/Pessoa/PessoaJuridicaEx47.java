package Entities.Pessoa;

public class PessoaJuridicaEx47 extends PessoaEx0047{

  private Integer funcionarios;

  public PessoaJuridicaEx47(){
    super();
  }

  public PessoaJuridicaEx47(String nome, Double rendaAnual, Integer funcionarios) {
    super(nome, rendaAnual);
    this.funcionarios = funcionarios;
  }

  public Integer getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(Integer funcionarios) {
    this.funcionarios = funcionarios;
  }


  @Override
  public Double taxa(){
    Double resultado = 0.0;

    if (getFuncionarios() > 10){
      resultado = getRendaAnual() * 0.14;
    }

    else if (getFuncionarios() < 10){
      resultado = getRendaAnual() * 0.16;
    }
    
    return resultado;
  }


  
}
