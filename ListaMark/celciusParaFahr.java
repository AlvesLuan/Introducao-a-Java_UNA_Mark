package aulasuna;
import java.util.*;
public class celciusParaFahr {
    
    public static void main(String[] args)
    {
        double temperaturaCelsius, temperaturaFahr;
        
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        
        System.out.println("Informe a sua temperatura em Celcius: ");
        temperaturaCelsius = Entrada.nextDouble();
        
        temperaturaFahr = (temperaturaCelsius * 1.8) + 32;
        System.out.println("Esta temperatura em Fahrenheit é "+temperaturaFahr+"°F");
                
    }
}
