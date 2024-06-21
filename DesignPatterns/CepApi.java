package DesignPatterns;

public class CepApi {

  // Aplicando o Singleton

  private static CepApi instancia = new CepApi();

  private CepApi(){
    super();
  }

  public static CepApi getInstancia(){
    return instancia;
  }

  // fim do singleton ----------------------------------------------------

  public String recuperarCidade(String cep){
    return "Araraquara";
  }
  public String recuperarEstado(String cep){
    return "SP";
  }
}
