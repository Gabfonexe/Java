package Aulas.Funcoes;

public class Funções_Para_Strings {

  public static void main(String[] args) {
    
    String original = "abcde FGHIJ ABC abc DEFG   ";

    String s01 = original.toLowerCase(); // transforma em minusculo
    String s02 = original.toUpperCase(); // transforma em maiusculo
    String s03 = original.trim(); // retira o espaço
    String s04 = original.substring(2); //começa de um ponto determinado
    String s05 = original.substring(2, 9); //começa de um ponto determinado
    String s06 = original.replace('a', 'x'); // troca 
    String s07 = original.replace("abc", "xy"); // troca
    int i = original.indexOf("bc"); // sugere o valor inicial do termo de parametro
    int j = original.lastIndexOf("bc"); // sugere o valor final do termo de parametro
    String[] vect = original.split(" "); // separa a frase

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim -" + s03 + "-");
    System.out.println("subString(2): -" + s04 + "-");
    System.out.println("subStrinng(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);
    System.out.println(vect[0]);


  }
  
}
