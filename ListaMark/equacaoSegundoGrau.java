package aulasuna;
import java.util.*;
public class equacaoSegundoGrau {
    public static void main(String[] args)
    {
        double a, b, c, delta, raiz1, raiz2;

        Scanner Entrada;
        Entrada = new Scanner(System.in);

        System.out.println("Equação de 2º grau\nInforme o A: ");
        a = Entrada.nextDouble();
        System.out.println("Informe o B: ");
        b = Entrada.nextDouble();
        System.out.println("Informe o C: ");
        c = Entrada.nextDouble();

        delta = (b * b) - (4 * a * c);

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Suas raizes são: \nRaiz 1: "+raiz1+"\nRaiz 2: "+raiz2);
    }
}
