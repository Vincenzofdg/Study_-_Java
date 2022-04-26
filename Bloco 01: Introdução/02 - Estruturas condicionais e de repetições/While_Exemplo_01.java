public class While {

  public static void main(String[] args) {
    // Cria um array com os inscritos
    String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
        "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

    // Determina o número máximo de vagas
    // A palavra `final` determina que o valor dessa variável não é alterável, ele
    // passa a ser uma constante!
    final int numeroVagas = 10;

    // Criamos um vetor vazio com espaço igual ao número de vagas.
    String[] vagas = new String[numeroVagas];

    // Determinamos quantas vagas já foram preenchidas
    int vagaAtual = 0;
    String inscrito;

    while (vagaAtual < numeroVagas) {
      inscrito = inscritos[vagaAtual];
      vagas[vagaAtual] = inscrito;
      vagaAtual += 1;

      System.out.printf("Inscrição: %s | Vaga: %d\n", inscrito, (vagaAtual + 1));
    }

  }

}
