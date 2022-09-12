package aulasuna;
import java.util.*;
public class tabuadaAte10semFOR {
    public static void main(String[] args)
    {
      int numero, numeroAtualizado;

      Scanner Entrada;
      Entrada = new Scanner(System.in);

      System.out.println("\nInforme o numero desejado: ");
      numero = Entrada.nextInt();

      numeroAtualizado = numero * 1;
      System.out.println("\n"+numero+" x 1 = "+numeroAtualizado);

      numeroAtualizado = numero * 2;
      System.out.println(numero+" x 2 = "+numeroAtualizado);

      numeroAtualizado = numero * 3;
      System.out.println(numero+" x 3 = "+numeroAtualizado);

      numeroAtualizado = numero * 4;
      System.out.println(numero+" x 4 = "+numeroAtualizado);

      numeroAtualizado = numero * 5;
      System.out.println(numero+" x 5 = "+numeroAtualizado);

      numeroAtualizado = numero * 6;
      System.out.println(numero+" x 6 = "+numeroAtualizado);

      numeroAtualizado = numero * 7;
      System.out.println(numero+" x 7 = "+numeroAtualizado);

      numeroAtualizado = numero * 8;
      System.out.println(numero+" x 8 = "+numeroAtualizado);

      numeroAtualizado = numero * 9;
      System.out.println(numero+" x 9 = "+numeroAtualizado);

      numeroAtualizado = numero * 10;
      System.out.println(numero+" x 10 = "+numeroAtualizado+"\n");
    }
}
