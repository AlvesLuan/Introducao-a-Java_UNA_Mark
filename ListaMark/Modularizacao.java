import java.util.*;
public class Main {

  public static int soma(int a, int b){
    return a+b;
  }

  public static double maiorValor (double v1, double v2){
    if (v1 > v2) return v1;
    return v2;
  }
  
  public static int le(String dado){
    int numeral;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Informe o "+dado+": ");
    numeral = entrada.nextInt();
    return numeral;
  }
  
  public static void main(String[] args){
    
    System.out.println(maiorValor(15.6, 29.8));
    
    // int numero1, numero2, resultado;

    // numero1 = le("numero");
    // numero2 = le("numero");
    
    // resultado = soma(numero1, numero2);
    
    // System.out.println("resultado = "+resultado);
  }
}
