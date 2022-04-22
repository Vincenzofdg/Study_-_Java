package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class A_Exercicio {
  /**
   * Exercicios propostos pelo Curso.
   */
  public static void main(String[] args) {
    // Exercicio 01:
    // Emprima no terminal o numero seu sucessor e antecessor.

    Scanner scan01 = new Scanner(System.in);

    System.out.printf("Digite um número: ");
    int num = scan01.nextInt();

    System.out.printf("R: O número %d tem %d como seu antecessor e %d como seu sucessor.", num, (num + 1), (num - 1));

    // Exercicio 02:
    // Emprima no terminal o lado e a área de um quadrado.

    Scanner scan02 = new Scanner(System.in).useLocale(Locale.US);

    System.out.printf("\nDigite a medida do lado do quadrado: ");
    double lado = scan02.nextDouble();

    double area = Math.pow(lado, 2);

    System.out.printf("R: A area do quadrado de lado %.3f é igual a %.2f", lado, area);

  }

}
