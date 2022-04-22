package A_Introducao;

import java.util.Scanner;

public class A_Exercicio {

  public static void main(String[] args) {
    // Exercicio 01:
    // Desenvolva um algoritmo em Java que, após ler um número do console, imprime o seu antecessor
    // e seu sucessor no seguinte formato: O número X tem Y como seu antecessor e Z como seu sucessor.
    Scanner scan = new Scanner(System.in);

    System.out.printf("Digite um número: ");
    int num = scan.nextInt();

    System.out.printf("O número %d tem %d como seu antecessor e %d como seu sucessor.", num, (num + 1), (num - 1));
  }

}
