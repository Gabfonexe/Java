public class CepInvalidoException {
  public static void main(String[] args) {
    
    try{ 
    String cepFormatado = formatarCep("22391300");
    System.out.println(cepFormatado);
    } catch (CepException e){
      e.printStackTrace("O cep não corresponde ");
    }
  }


  static String formatarCep(String cep) throws CepException{
    if(cep.length() != 8){
      throw new CepInvalidoException();

      return "23.765-064";
    }
  }
  
}
