package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
  /**
   * Exercicio 04.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite um número:");
      byte valor = scan.nextByte();
      int qtdBits = valor * 8;

      System.out.println(valor + " bytes correspodem a " + qtdBits + " bits");
    } finally {
      scan.close();
    }

  }

}
