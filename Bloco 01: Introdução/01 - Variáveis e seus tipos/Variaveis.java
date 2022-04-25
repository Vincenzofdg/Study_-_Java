package A_Introducao;

public class Variaveis {

	public static void main(String[] args) {
		// TIPOS PRIMITIVOS
		 System.out.println("\nTIPOS PRIMITIVOS\n\n");
		
		// Byte: Composto por 8 bits
		byte numB = 91; 
        System.out.printf("byte: %d\n", numB);
        
        System.out.println("---------------------");
        
        // Short: Entre -32768 até 32767.
        short semUnderscore = 300, comUnderscore = 20_000;
        
        System.out.printf("Short sem Underscore: ");
        System.out.println(semUnderscore);
        System.out.printf("\nShort com Underscore: ");
        System.out.println(comUnderscore);
        
        System.out.println("---------------------");
        // Int: Entre -2.147.483.648 até 2.147.483.647.
        int numI1 = 10, numI2 = 20, sum;

        sum = numI1 + numI2;

        System.out.printf("A soma de %d e %d é %d\n", numI1, numI2, sum);
        
        System.out.println("---------------------");        
        // Long: Entre -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
        long numL1 = 102040, numL2 = 102030405060L;
        
        System.out.printf("Recebe um valor Inteiro e se torna um Long => %d\n", numL1);
        System.out.printf("Recebe um valor Long e se torna um Long => %d\n", numL2);
        
        System.out.println("---------------------");        
        // Float: Valores flutuantes.
        float numF1 = 2000.59f, numF2 = 1500.38f;
        
        System.out.printf("A subtração de %.2f e %.2f é %.3f\n", numF1, numF2, (numF1 / numF2));
                
        // Double: Mesma função do float mas com uma precissao muito maior que.
        double numD1 = 2000.59d, numD2 = 1500.38d;
        
        System.out.printf("A divição de %f e %f é %f\n", numD1, numD2, (numD1 - numD2));
        
        System.out.println("---------------------");        
        // Char: Representa um Caractere.
        char letra01 = 'c', letra02 = 'C';
        		
       	System.out.printf("A '%s' é igual a '%s'? %s\n", letra01, letra02, (letra01 == letra02));
       	
       	System.out.println("---------------------");
       	// Boolean: True ou False.
       	boolean verdadeiro = true, falso = false;
       	
       	System.out.printf("Verdadeiro em ingles é %s\nFalso em ingles é %s\n", verdadeiro, falso);
       	
       	System.out.println("---------------------");
       	// TIPOS NÃO PRIMITIVOS
     	System.out.println("\n\nTIPOS NÃO PRIMITIVOS\n\n");
     	
     	// String
     	String frase = "Java é muito legal", numeros = "12345", caractere = "c";
     	
     	System.out.printf("Frase: %s | ID: %s-%s\n", frase, numeros, caractere);
     	
     		// Usando o StringBuilder
     	StringBuilder stringBuilder = new StringBuilder();
     	String fraseST, estou = "Estou ", aprendendo = "aprendendo", aUsar = " a usar ", stringB = "StringBuilder", emJava = " em Java.";
     	
     	fraseST = stringBuilder
     			.append(estou)
                .append(aprendendo)
                .append(aUsar)
                .append(stringB)
                .append(emJava)
                .toString();
     	
     	System.out.println(fraseST);
     	
     	StringBuilder fraseSTNew = stringBuilder.replace(6, 18, "tentando");
     	
     	System.out.println(fraseSTNew);
     	
     	System.out.println("---------------------");
       	// Array
     	int[] arrayDeInteiros = new int[5]; 

        arrayDeInteiros[0] = 40;
        arrayDeInteiros[1] = 55;
        arrayDeInteiros[2] = 63;
        arrayDeInteiros[3] = 17;
        arrayDeInteiros[4] = 22; 

        System.out.println("Valor do indice de um Array : " + arrayDeInteiros[3]);
     	
        int[][] matriz = new int [2][3];
        
        matriz[0][0] = 10;
        matriz[1][0] = 20;
        
        System.out.println("Valor da Matris na posiãço [1,0]: " + matriz[1][0]);
        
        int[] arrayInt = { 10, 20, 30, 40 };
        
        System.out.println("Somatoria do array: " + (arrayInt[0] + arrayInt[1] + arrayInt[2] + arrayInt[3]));
        System.out.println("Extensao do array: " + arrayInt.length);
	}

}
