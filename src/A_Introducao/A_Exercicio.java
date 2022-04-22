package A_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class A_Exercicio {
  /**
   * Exercicios propostos pelo Curso.
   */
  public static void main(String[] args) {
    // Exercicio 01:
    // Emprima no terminal o numero seu sucessor e antecessor.
    Scanner scan01 = new Scanner(System.in);

    try {
      System.out.printf("Digite um número: ");
      int num = scan01.nextInt();

      System.out.printf("R: O número %d tem %d como seu antecessor e %d como seu sucessor.", num, (num + 1), (num - 1));
    } finally {
      scan01.close();
    }

    // Exercicio 02:
    // Emprima no terminal o lado e a área de um quadrado.
    Scanner scan02 = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.printf("\nDigite a medida do lado do quadrado: ");
      double lado = scan02.nextDouble();
      double area = Math.pow(lado, 2);

      System.out.printf("R: A area do quadrado de lado %.3f é igual a %.2f", lado, area);
    } finally {
      scan02.close();
    }

    // Exercicio 03:
    // Emprima no terminal o resultado do calculo de IMC.
    Scanner scan3 = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite o peso:");
      float peso = scan3.nextFloat();
      System.out.println("Digite a aultura:");
      float altura = scan3.nextFloat();
      float imc = peso / (float) Math.pow(altura, 2);

      System.out.println(imc);
    } finally {
      scan3.close();
    }

    // Exercicio 04:
    // Converter valor de byte para bits.
    Scanner scan4 = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite um número:");
      byte valor = scan4.nextByte();
      int qtdBits = valor * 8;

      System.out.println(valor + " bytes correspodem a " + qtdBits + " bits");
    } finally {
      scan4.close();
    }

    // Exercicio 05:
    // Faça uma saida falando se a lampada esta ligada ou nao.
    boolean isLigada = true;

    System.out.println("A lampada ligada: " + isLigada + "!");

    // Exercicio 06:
    // Calcule o fatorial de 18.
    int num = 18;
    long fatorial18 = (long) num;

    while (num > 1) {
      fatorial18 *= --num;
    }

    System.out.println("O fatorial de 18 é igual a " + fatorial18);
  }

}
