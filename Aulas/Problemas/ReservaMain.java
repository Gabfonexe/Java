package Aulas.Problemas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entities.ReservaExcecao;
import Exception.DomainException;

public class ReservaMain {

  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  try{
    System.out.print("Número do Quarto: ");
    int numero = sc.nextInt();
    System.out.print("Check-in data (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(sc.next());
    System.out.print("Check-out data (dd/MM/yyyy): ");
    Date checkout = sdf.parse(sc.next());

    ReservaExcecao reserva = new ReservaExcecao(numero, checkIn, checkout);
    System.out.println("Reserva: " + reserva);

    System.out.println();
    System.out.println("Digite os dados para atualizar as Reservas: ");
    System.out.println("Check-in data (dd/MM/yyyy): ");
    checkIn = sdf.parse(sc.next());
    System.out.print("Check-out data (dd/MM/yyyy): ");
    checkout = sdf.parse(sc.next());

    reserva.updateDates(checkIn, checkout);
    System.out.println("Reserva: " + reserva);
  }

  catch (ParseException e){
    System.out.println("Formato de Data Inválida");
  }

  catch (DomainException e){
    System.out.println("Erro na Reserva: " + e.getMessage());
  }

  catch (RuntimeException e){
    System.out.println("Erro Inesperado");
  }
  
  sc.close();
  
  }
}
