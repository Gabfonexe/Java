public class BreakEContinue {
  /*O Continue é usado para pular a p´roxima execução do código fora do loop ou até mesmo dentro dele */

  public static void main(String[] args) {

   
    
    for(int numero=1; numero <=7; numero ++){
      if(numero == 3){
        continue;
      }

      if (numero == 6){
        break;
      }
    }
  }
}
