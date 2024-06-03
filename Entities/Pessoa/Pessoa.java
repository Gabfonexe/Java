package Entities.Pessoa;

public class Pessoa {

  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade =  idade;
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  public int getIdade(){
    return idade;
  }
  public void setAltura(double altura){
    this.altura = altura;
  }
  public double getAltura(){
    return altura;
  }

  public String toString(){
    return String.format(" Nome: %s%n Idade: %d%n Altura: %.2f", nome, idade, altura);    
  }



}