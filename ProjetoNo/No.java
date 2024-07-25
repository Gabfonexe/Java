package Java.ProjetoNo;

// NÓ - entendendo o conceito de encadiamento de nós no java
public class No {

  private String conteudo;
  private No proximNo;

  public No(String conteudo){
    this.proximNo = null; // -> o último nó sempre aponta para o Null
    this.conteudo = conteudo;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public No getProximNo() {
    return proximNo;
  }

  public void setProximNo(No proximNo) {
    this.proximNo = proximNo;
  }

  @Override
  public String toString() { // preciso mostrar só o conteúdo
    return "No [conteudo=" + conteudo + "]";
  }

  
  
}