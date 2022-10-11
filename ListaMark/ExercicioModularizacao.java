import java.util.*;
public class Main {

  public static int maiorValor (int v1, int v2){
    if (v1 > v2) return v1;
    return v2;
  }
  
  public static int dobro (int v1){
    return v1 * 2;
  }
  
  public static double mediaAri(double numero1, double numero2, double numero3){
    return ((numero1+numero2+numero3)/3);
  }

  public static int fatorial(int numero){
    int fatorial = 1;
    for (int i = 1; i <= numero; i++){
      fatorial *= i;
    }
    return fatorial;
  }

  public static int somatorio(int numero){
    int somatorio = 0;
    for (int i = 1; i <= numero; i++){
      somatorio += i;
    }
    return somatorio;
  }
  
  public static void main(String[] args){
    
    System.out.println(dobro(7));
    System.out.println(maiorValor(7, 99));
    System.out.println(mediaAri(8,7,6));
    System.out.println(fatorial(4));
    System.out.println(somatorio(4));
    
  }
}
