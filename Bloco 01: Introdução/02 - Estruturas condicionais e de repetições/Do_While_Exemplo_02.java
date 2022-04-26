package Repeticao;

import java.util.Random;

public class IfElse {

  public static void main(String[] args) {
    int tenta, tentativas = 1;
    boolean recebida = false;

    do {
      tenta = new Random().ints(0, 2).findFirst().getAsInt();

      if (tenta == 0) {
        recebida = false;
        tentativas++;
      } else {
        recebida = true;
      }

    } while (!recebida);

    System.out.println("Entregue na " + tentativas + "º tentativa.");

  }

}
