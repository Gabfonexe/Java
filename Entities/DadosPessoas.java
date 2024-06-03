package Entities;

public class DadosPessoas {

  private String genero;
  private double altura;
  private double somaAltura;
  private int qtdMulheres;

  public DadosPessoas(double somaAltura, int qtdMulheres){
    this.somaAltura = somaAltura;
    this.qtdMulheres = qtdMulheres;
  }
  public DadosPessoas(String genero, double altura, double somaAltura, int qtdMulheres ){
    this.genero = genero;
    this.altura = altura;
    this.somaAltura = somaAltura;
    this.qtdMulheres = qtdMulheres;
  }
  public DadosPessoas(double altura, String genero){
    this.altura = altura;
    this.genero = genero;
  }
  
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  public double getSomaAltura() {
    return somaAltura;
  }
  public void setSomaAltura(double somaAltura) {
    this.somaAltura = somaAltura;
  }
  public int getQtdMulheres() {
    return qtdMulheres;
  }
  public void setQtdMulheres(int qtdMulheres) {
    this.qtdMulheres = qtdMulheres;
  }
}
