import java.util.*;
class Main {
public static void main(String[] args)
{
  Scanner entrada = new Scanner(System.in);
  int idade, contadorpeso = 0;
  double peso, mediaIdade = 0;
  for (int i = 1; i <= 7; i++){
    System.out.println("\nDigite seu Idade: ");
    idade = entrada.nextInt();
    System.out.println("Digite seu peso: ");
    peso = entrada.nextDouble();
    mediaIdade = idade + mediaIdade;
    if (peso >= 90) {
      contadorpeso++;
    }
  }
  mediaIdade = mediaIdade / 7;
  System.out.println("\nTem " +contadorpeso+ " pessoas com mais de 90kgs");
  System.out.println("\nA media de idade dos sete é " +mediaIdade);
}
}
