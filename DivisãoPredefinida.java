package aulamark0509;

public class DivisãoPredefinida
{
    public static void main(String[] args) 
    {      
        double  dividendo, divisor, quociente;
        dividendo = 150;
        divisor = 3;
        quociente = dividendo / divisor;
        
        if (divisor == 0){
           System.out.println("Impossivel dividir");} 
        else {
            quociente = dividendo / divisor;
            System.out.println(quociente);
        }     
    }
}
