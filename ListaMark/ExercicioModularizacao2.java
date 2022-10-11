import java.util.*;
public class Main {

  public static int soma(int a, int b){
      return a+b;
    }

  public static int subtracao(int a, int b){
    return a-b;
  }

  public static int multiplicacao(int numero, int multiplicador){
    int c = 0;
    for (int i = 0; i < multiplicador; i++){
      c += numero;
    }
    return c;
  }
  
  public static void main(String[] args){
    
    System.out.println(soma(7,9));
    System.out.println(subtracao(10,3));
    System.out.println(multiplicacao(2,6));
    
  }
}
