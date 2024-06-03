package Aulas.EstruturaRepeticao;

public class For_Each {
//  Leitura: "para cada objeto 'obj' contido em vect, faça:"

  public static void main(String[] args) {

    String[] vect = new String[] {"Maria", "Bob", "Alex"};
    for (int i=0; i< vect.length; i++) {
    System.out.println(vect[i]);
    }
    for (String obj : vect) { // criou uma var (obj) que vai passar pela toda lista do vect
    System.out.println(obj);
    }
  }


  
}
