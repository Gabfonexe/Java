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

    int a, b;

    a = 5;
    b = 6;

    String resultado = "";

    String resultadoo = a==b ? "Verdadeiro" : "Falso"; //estrutura condicional ternária

    if(a==b){
      resultado = "Verdadeiro";
    }
    else {
      resultado = "falso";
    }
    
    System.out.println(resultado);
    System.out.println(resultadoo);

  }
}
