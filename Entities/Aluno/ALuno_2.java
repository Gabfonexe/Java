package Entities.Aluno;

public class ALuno_2 {

  private String nome;
  private double notaUm;
  private double notaDois;
  private String email;

  public ALuno_2(String nome, double nota1, double nota2){
    this.nome = nome;
    this.notaUm = nota1;
    this.notaDois = nota2;
  }

  public ALuno_2 (String nome, String email){
    this.nome = nome;
    this.email = email;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public double getNotaUm(){
    return notaUm;
  }
  public void setNotaUm(double nota1){
    this.notaUm = nota1;
  }
  public double getNotaDois(){
    return notaDois;
  }
  public void setNotaDois(double nota2){
      this.notaDois = nota2;
  }
  
  public String toString() {
    return nome +
    ", " +
    email ;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

 



}
