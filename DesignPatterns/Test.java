package DesignPatterns;

public class Test {

  public static void main(String[] args) {
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder); 
  }
}
