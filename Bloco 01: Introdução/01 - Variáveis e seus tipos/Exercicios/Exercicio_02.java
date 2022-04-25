package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
  /**
   * Exercicio 02.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.printf("\nDigite a medida do lado do quadrado: ");
      double lado = scan.nextDouble();
      double area = Math.pow(lado, 2);

      System.out.printf("R: A area do quadrado de lado %.3f é igual a %.2f", lado, area);
    } finally {
      scan.close();
    }

  }

}
