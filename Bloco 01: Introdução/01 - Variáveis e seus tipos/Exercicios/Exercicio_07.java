package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
  /**
   * Exercicio 07.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    int[] myArray = new int[3];

    try {
      for (int index = 0; index < 3; index++) {
        System.out.println("Digite um número:");
        myArray[index] = scan.nextInt();
      }

      int i = myArray.length - 1;
      int soma = 0;

      while (i >= 0) {
        soma += myArray[i--];
      }

      System.out.println("A soma é: " + soma);
    } finally {
      scan.close();
    }

  }

}
