package Aulas.SwitchCase;
import java.util.Scanner;
public class Switch_Case {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int x;
    String dia;
    System.err.print("Digite o número de 1 a 7: ");
    x = sc.nextInt();

    switch (x) {

      case 1:
        dia = "Domingo";
        break;
    
      case 2:
        dia = "Segunda";
        break;
    
      case 3:
        dia = "Terça";
        break;
    
      case 4:
        dia = "Quarta";
        break;
    
      case 5:
        dia = "Quinta";
        break;
    
      case 6:
        dia = "Sexta";
        break;
    
      case 7:
        dia = "Sábado";
        break;
    
      default:
        dia = "Número Inválido";
        break;
    }
    System.err.printf("dia da semana: %s ", dia);

    sc.close();
  }
  
}
