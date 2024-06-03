package Aulas.BoxingUnboxing;

public class Boxing_Unboxing_WrapperClass {
// WRAPPER CLASS ACEITA NULL E NÃO PRECISA UTILIZAR O (TIPO PRIMITIVO) PARA CONVERTER UM TIPO PARA OUTRO

  Integer x = 10;
  //int y = x * 2;
  public String name;
  public Double price;
  public Integer quantity;

  Object obj = x;
  int y = (int) obj; // por não estar com a wrapper class, precisa utilizar o (...) var

  
}
