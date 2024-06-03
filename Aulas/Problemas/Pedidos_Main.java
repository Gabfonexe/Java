package Aulas.Problemas;
import java.util.Date;

import Entities.Pedidos.Pedidos;

public class Pedidos_Main {

  public static void main(String[] args) {

    
    Pedidos pedidos = new Pedidos(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

    System.out.println(pedidos);

    OrderStatus os1 = OrderStatus.ENVIADO;
    OrderStatus os2 = OrderStatus.valueOf("ENVIADO");

    System.out.println(os1);
    System.out.println(os2);
  }  
}


