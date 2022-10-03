import java.util.*;
class Main {
public static void main(String[] args)
{
  Scanner entrada = new Scanner(System.in);
  int numeroA, numeroB, numeroPotencia = 1;
  System.out.println("Digite o numero A e o numero B,\nsendo que A será elevado a B");
  numeroA = entrada.nextInt();
  numeroB = entrada.nextInt();
  for (int i = 0; i < numeroB; i++){
    numeroPotencia = numeroPotencia * numeroA;}
  System.out.printf("\nO numero "+ numeroA +" elevado a " +numeroB+ " é igual a "+ numeroPotencia);
}
}
