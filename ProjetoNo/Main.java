package Java.ProjetoNo;

public class Main {
  public static void main(String[] args) {
    
    No no1 = new No("Conteúdo no1");
    No no2 = new No("Conteúdo no2");
    no1.setProximNo(no2);

    No no3 = new No("Conteúdo no3");
    no2.setProximNo(no3);

    No no4 = new No("Conteúdo no4");
    no3.setProximNo(no4);

    // no1->no2->no3->n04->null

    System.out.println(no1);
    System.out.println(no1.getProximNo());

    System.out.println("----------------------------");

    //Mostrando o encadiamento
    System.out.println(no1);
    System.out.println(no1.getProximNo());
    System.out.println(no1.getProximNo().getProximNo());
    System.out.println(no1.getProximNo().getProximNo().getProximNo());
    System.out.println(no1.getProximNo().getProximNo().getProximNo().getProximNo());
    




  }
  
}
