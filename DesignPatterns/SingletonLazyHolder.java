package DesignPatterns;

/**
 * Singleton "Lazy Holder"
 * @see <a href = "https://stackoverflow.com/a/24018148">Referencia </a>
 * 
 * @author falvojr
 */


public class SingletonLazyHolder {

  private static class InstanceHolder{
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  private SingletonLazyHolder(){
    super(); // não precisa colocar o super
  }

  public static SingletonLazyHolder getInstancia(){
    return InstanceHolder.instancia;
  }
}
