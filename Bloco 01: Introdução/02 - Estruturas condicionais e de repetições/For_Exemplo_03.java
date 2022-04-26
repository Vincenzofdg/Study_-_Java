public class ForEach {

  public static void main(String[] args) {
    String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
    int i = 1;

    for (String aluno : alunos) {
      System.out.println("Matricula: " + i + " - Aluno: " + aluno);
      i++;
    }

    System.out.println("\nA lista de chamadas possui " + (alunos.length) + " alunos");
  }

}
