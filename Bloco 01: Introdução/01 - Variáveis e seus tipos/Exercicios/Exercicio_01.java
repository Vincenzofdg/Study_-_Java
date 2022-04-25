package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
  /**
   * Exercicio 01.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.printf("Digite um número: ");
      int num = scan.nextInt();

      System.out.printf("R: O número %d tem %d como seu antecessor e %d como seu sucessor.", num, (num + 1), (num - 1));
    } finally {
      scan.close();
    }

  }

}
