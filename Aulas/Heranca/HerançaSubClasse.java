package Aulas.Heranca;

public class HerançaSubClasse extends HerançaClasePrincipal{

    private Double limiteEmprestimo;

    public HerançaSubClasse(){
      super(); // pega os metodos, args da classe principal
    }

    public HerançaSubClasse(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
      super(numero, titular, saldo); // pega os metodos, args da classe principal
      this.limiteEmprestimo = limiteEmprestimo;
    }

    
    public Double getLimiteEmprestimo(){
      return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo){
      this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia){
      if (quantia <= limiteEmprestimo){
        saldo += quantia - 10.0;
      }
    } 
  
}
