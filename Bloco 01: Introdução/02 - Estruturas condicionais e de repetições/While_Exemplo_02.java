public class While {

  public static void main(String[] args) {
    int numeroInscritos = 100;
    int numeroCupons = 50;
    int primeirosInscritos = 0;

    while (primeirosInscritos <= numeroCupons) {
      System.out.println("Inscrito de numero: " + primeirosInscritos + " ganhou o cupom");
      primeirosInscritos++;
    }

    System.out.println(numeroInscritos + " pessoas se inscreveram!");
  }

}
