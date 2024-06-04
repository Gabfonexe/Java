public class Operadores {
  
  public static void main(String[] args) {
    /*A partir do momento em que há um caractere o operador de soma faz a função de concatenar
     * veja os exemplos abaixo: 
     */


    String concatenacao = "?";

    concatenacao = 1+1+1+"1";
    
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);

    concatenacao = "1" + (1+1+1);

    System.out.println(concatenacao);

  }
}
