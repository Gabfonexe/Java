package Aulas.Polimorfismo;

import Aulas.Heranca.HerançaClasePrincipal;
import Aulas.Heranca.HerançaSubClasse2;

public class Polimorfismo extends HerançaClasePrincipal{
  /* Em Programação Orientada a Objetos, polimorfismo é recurso que
permite que variáveis de um mesmo tipo mais genérico possam
apontar para objetos de tipos específicos diferentes, tendo assim
comportamentos diferentes conforme cada tipo específico.*/
  public static void main(String[] args) {
    HerançaClasePrincipal x = new HerançaClasePrincipal(1020, "Jorger", 1000.0);
    HerançaClasePrincipal y = new HerançaSubClasse2(1023, "Maria", 1000.0, 0.01);

    x.saque(50.0);
    y.saque(50.0);
    System.out.println(x);
    System.out.println(y);
  }

}
