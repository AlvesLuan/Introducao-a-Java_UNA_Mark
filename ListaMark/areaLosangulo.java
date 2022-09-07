package aulasuna;
import java.util.*;
public class areaLosangulo {
    public static void main(String[] args)
    {
        double diagonalMaior, diagonalMenor, area;
                
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        
        System.out.println("Informe o tamanho da diagonal maior: ");
        diagonalMaior = Entrada.nextDouble();
        System.out.println("Informe o tamanho da diagonal menor: ");
        diagonalMenor = Entrada.nextDouble();
        
        area = (diagonalMaior * diagonalMenor)/2;
        System.out.println("A área do seu Losangulo é "+area);
    }
}
