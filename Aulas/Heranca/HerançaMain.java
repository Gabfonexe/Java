package Aulas.Heranca;


public class HerançaMain {

  public static void main (String[] args){

    HerançaClasePrincipal conta = new HerançaClasePrincipal(1001, "Jorge", 500.0);
    HerançaSubClasse contaBusiness = new HerançaSubClasse(1002, "Maria", 0.0, 500.0);

    //UPCASTING 

    HerançaClasePrincipal conta1 = contaBusiness; // isso pode acontecer pq ela é subclass
    HerançaClasePrincipal conta2 = new HerançaSubClasse(1003, "Bob", 0.0, 200.0);
    HerançaClasePrincipal conta3 = new HerançaSubClasse2(1004, "Anna", 0.0, 0.01);

    //Downcasting

    HerançaSubClasse conta4 = (HerançaSubClasse)conta2;
    conta4.emprestimo(100.0);


    // HerançaSubClasse conta5 = (HerançaSubClasse)conta3; - esse daria erro pois são 2 sub class

    if (conta3 instanceof HerançaSubClasse){
      HerançaSubClasse conta5 = (HerançaSubClasse)conta3;
      conta5.emprestimo(200.0);
      System.out.println("Emprestimo!");
    }

    if (conta3 instanceof HerançaSubClasse2){
      HerançaSubClasse2 conta5 = (HerançaSubClasse2)conta3;
      conta5.updateSaldo();
      System.out.println("Atualizado!");
    }
    
  }


  
}
