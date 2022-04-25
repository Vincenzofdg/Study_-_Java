package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
  /**
   * Exercicio 06.
   */
  public static void main(String[] args) {
    int num = 18;
    long fatorial18 = (long) num;

    while (num > 1) {
      fatorial18 *= --num;
    }

    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }

}
