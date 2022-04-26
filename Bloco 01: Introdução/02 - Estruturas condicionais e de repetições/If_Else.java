public class IfElse {
  /*
   * Caso o resultado seja superior a 7, é exibida a mensagem:
   * "Parabéns! Você esta na próxima etapa"
   *
   * Caso contrario, exibe:
   * "Poxa, não foi desta vez ... mas continue tentando. Até a próxima"
   **/
  public static void main(String[] args) {
    int resultado = 8;

    if (resultado > 7) {
      System.out.println("Parabéns! Você esta na próxima etapa");
    } else {
      System.out.println("Poxa, não foi desta vez ... mas continue tentando. Até a próxima");
    }

  }

}
