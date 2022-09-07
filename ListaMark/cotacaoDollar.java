package aulasuna;
import java.util.*;
public class cotacaoDollar {
    
    public static void main(String[] args)
    {
        double cotacaoDollarEmReais, valorDoUsuarioEmDollares, valorDoUsuarioEmReais;

        Scanner Entrada;
        Entrada = new Scanner(System.in);

        System.out.println("Informe a cotação atual do Dollar (em R$): ");
        cotacaoDollarEmReais = Entrada.nextDouble();
        System.out.println("Quanto você tem em Dollares? ");
        valorDoUsuarioEmDollares = Entrada.nextDouble();

        valorDoUsuarioEmReais = cotacaoDollarEmReais * valorDoUsuarioEmDollares;

        System.out.println("O seu valor em reais é R$"+valorDoUsuarioEmReais);
    } 
}
