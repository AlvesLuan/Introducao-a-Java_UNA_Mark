package somarboletos;
import java.util.*;
public class SomarBoletos {

    public static void main(String[] args)
{  
    float salarioLiquido, boleto1, boleto2, boleto3, boleto4, totalDespesas, sobras;

    Scanner Entrada;
    Entrada = new Scanner(System.in);

    System.out.println("Informe seu Salário Liquido: ");
    salarioLiquido = Entrada.nextFloat();
    
    System.out.println("Informe o valor do primeiro boleto: ");
    boleto1 = Entrada.nextFloat();
    System.out.println("Informe o valor segundo boleto: ");
    boleto2 = Entrada.nextFloat();
    System.out.println("Informe o valor terceiro boleto: ");
    boleto3 = Entrada.nextFloat();
    System.out.println("Informe o valor do quarto boleto: ");
    boleto4 = Entrada.nextFloat();
    
    totalDespesas = (boleto1 + boleto2 + boleto3 + boleto4);
    System.out.println("\nSuas despesas totais são R$"+totalDespesas);
    
    if (totalDespesas > salarioLiquido){
        sobras = totalDespesas - salarioLiquido;
        System.out.println("Vai faltar R$"+sobras+" ai parceiro");} 
    
    else{
        sobras = salarioLiquido - totalDespesas;
        System.out.println("Sobrará R$"+sobras+" pra vc brincar!!");}      
}    
}
