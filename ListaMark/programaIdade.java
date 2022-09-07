package aulasuna;
import java.util.*;

public class programaIdade {
    public static void main(String[] args)
    {
        int idadeDoUsuario, anoAtual, anoNascimento, idadeEm2050;
        
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        
        System.out.println("Em que ano estamos? ");
        anoAtual = Entrada.nextInt();
        System.out.println("Você nasceu em que ano? ");
        anoNascimento = Entrada.nextInt();
        
        idadeDoUsuario = anoAtual - anoNascimento;
        idadeEm2050 = 2050 - anoNascimento;
        
        System.out.println("Sua idade é "+idadeDoUsuario+" anos. \nEm 2050 você terá "+idadeEm2050+" anos.");
        
    }
    
}
