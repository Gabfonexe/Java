package Java.ProjetoNo;

// NÓ - entendendo o conceito de encadiamento de nós no java
public class No<T> { // Definindo como Generics (T)

  private T conteudo;
  private No<T> proximNo;

  public No(T conteudo){
    this.proximNo = null; // -> o último nó sempre aponta para o Null
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public No<T> getProximNo() {
    return proximNo;
  }

  public void setProximNo(No<T> proximNo) {
    this.proximNo = proximNo;
  }

  @Override
  public String toString() { // preciso mostrar só o conteúdo
    return "No [conteudo=" + conteudo + "]";
  }

  
  
}