package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
  /**
   * Exercicio 03.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite o peso:");
      float peso = scan.nextFloat();
      System.out.println("Digite a aultura:");
      float altura = scan.nextFloat();
      float imc = peso / (float) Math.pow(altura, 2);

      System.out.println(imc);
    } finally {
      scan.close();
    }

  }

}
