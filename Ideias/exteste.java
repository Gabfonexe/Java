package Ideias;
import java.util.Scanner;
public class exteste {
  
    public static void main(String[] args) {
        double maior=0;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite o número de vezes:");
        double base = entrada.nextInt();
        for (int i = 0; i < base; i++) {

            System.out.println("Digite o "+(i+1)+"ª valor: ");
            double valor = entrada.nextDouble();
            if(i==0){
                maior = valor;
            } else if (valor>maior) {
                maior = valor;
            }
        }
        System.out.println("O maior valor é o " + maior);
    }
}


