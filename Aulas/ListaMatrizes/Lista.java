package Aulas.ListaMatrizes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
/* 
• Tamanho da lista: size()

• Obter o elemento de uma posição: get(position)

• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)

• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)

• Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());

• Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);  */
  
  public static void main(String[] args) {
/* Toda lista para ser instanciada deve haver uma interface, que no caso estou utilizando a interface Array */

    List<String> lista = new ArrayList<>(); // criando uma lista
    lista.add("Maria");
    lista.add("Alex");
    lista.add("Bob");
    lista.add("Anna");
    lista.add(2, "Marco");

    System.out.println(lista.size()); // tamanho da lista

    for(String x : lista){ // for each
      System.out.println(x); 
    }

    System.out.println("----------------");
    System.out.println("Index of Bob: " + lista.indexOf("Bob"));
    System.out.println("Index of Marco: " + lista.indexOf("Marco"));
    System.out.println("----------------");

    //criando uma lista para filtrar nomes que comecem com A

    List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

    for (String x : lista){
      System.out.println(x);
    }
    System.out.println("----------------");

    //criando um filtro para achar o primeiro nome com tal letra
   String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);                        ///lambda
   System.out.println(name); 
   
  }
}
