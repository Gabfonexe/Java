package Entities.Produto;

public class ProdutoEx49 {

  private String nome;
  private Double preco;
  private int quantidade;


  public ProdutoEx49(){
  }

  public ProdutoEx49(String nome, Double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public Double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public Double calcularPreco(){
    Double total = preco * quantidade;
    return total;
  }

  @Override
  public String toString(){
    return "" + nome + " " + String.format("%.2f",calcularPreco() );
  }
}
