import java.util.Random;

public class DoWhile {

  public static void main(String[] args) {
    int tentativas = 0, atendeu = 0;

    do {
      atendeu = new Random().ints(0, 2).findFirst().getAsInt();
      tentativas += 1;
    } while (atendeu == 0 && tentativas < 3);
    System.out.println("Candidato atendeu na tentativa: " + tentativas);
  }

}
