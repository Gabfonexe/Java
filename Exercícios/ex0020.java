package Exercícios;
import java.util.Scanner;

public class ex0020 {
// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int quantidade, valor, in, out ;
    in = 0;
    out = 0;

    System.out.println("Quantidade: ");
    quantidade = sc.nextInt();

  for ( int x=1; quantidade >= x; x++){
    //System.out.println(x);
    System.out.printf("Valor %d: ", x);
    valor = sc.nextInt();
    //numeros += valor;

    if (valor >= 10 && valor <= 20){
      in += 1;
    }
    else{
      out += 1;
    }
  }
  System.err.printf("%d in%n%d out", in, out);

    sc.close();
    }

}
