package DesignPatterns;

public class CrmService {

  private CrmService(){
    super(); // não precisa colocar o super
  }

  public static void gravarCliente(String nome, String cep, String cidade, String estado){
    System.out.println("Cliente salvo no sistema de CRM. ");
  }

   
  
}
