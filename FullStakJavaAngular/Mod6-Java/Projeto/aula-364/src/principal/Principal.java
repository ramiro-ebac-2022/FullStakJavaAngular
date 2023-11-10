package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar.
		 * 2. Ler dois números e informe o número maior.
		 * 3. Ler a idade de uma pessoa e dizer se é maior ou menor de idade.
		 * 4. Ler uma letra e informar se ela é vogal ou consoante.
		 */
		
		int numero1, numero2;
		char letra;
		String resultado;
		@SuppressWarnings("resource")
		Scanner ler_teclado = new Scanner(System.in);

		//-- 1 --
		System.out.println("*** Exercício 1 : número par ***");
		System.out.println("Digite um número : ");
		numero1 = ler_teclado.nextInt();
		System.out.printf("  -> O número %d é : %s", numero1, (numero1%2==0) ? "PAR" : "ÍMPAR" );
		System.out.println("");
		
		//-- 2 --
		System.out.println("*** Exercício 2 : número maior***");
		System.out.println("Digite o primeiro número : ");
		numero1 = ler_teclado.nextInt();
		System.out.println("Digite o segundo número : ");
		numero2 = ler_teclado.nextInt();
		System.out.printf("  -> O número maior é : %d", (numero1 > numero2) ? numero1 : numero2 );
		System.out.println("");
		
		//-- 3 --
		System.out.println("*** Exercício 3 : maior de idade***");
		System.out.println("Digite sua idade : ");
		numero1 = ler_teclado.nextInt();
		System.out.printf("  -> Você é %s", (numero1 >= 18) ? "MAIOR de idade" : "MENOR de idade" );
		System.out.println("");
		
		//-- 4 --
		System.out.println("*** Exercício 4 : vogal ou consoante***");
		System.out.println("Digite uma letra : ");
		letra = ler_teclado.next().charAt(0);
		if (Character.toUpperCase(letra)=='A' || 
			Character.toUpperCase(letra)=='E' || 
			Character.toUpperCase(letra)=='I' || 
			Character.toUpperCase(letra)=='O' || 
			Character.toUpperCase(letra)=='U') {
				resultado = "VOGAL";
		} else {
			resultado = "CONSOANTE";
		}
		System.out.println("  -> A letra digitada é : " + resultado);

	}

}
