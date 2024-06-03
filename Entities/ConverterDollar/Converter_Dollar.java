package Entities.ConverterDollar;

public class Converter_Dollar {

  public static final double IOF = 0.06;

  
  public static double converterDollar(double valor, double quantidade){
    return valor * quantidade * (1.0 + IOF);
  }
  
}
