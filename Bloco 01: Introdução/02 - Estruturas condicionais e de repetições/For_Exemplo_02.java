public class For {

  public static void main(String[] args) {
    String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
    int matricula, i;

    for (i = 0; i < alunos.length; i++) {
      matricula = i + 1;
      System.out.println("Matricula: " + matricula + " - Aluno: " + alunos[i]);
    }

    System.out.println("\nA lista de chamadas possui " + (alunos.length) + " alunos");
  }

}
