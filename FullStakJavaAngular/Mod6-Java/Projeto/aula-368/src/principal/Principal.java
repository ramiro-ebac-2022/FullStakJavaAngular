package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Ler um valor inteiro e imprimir os números pares anteriores a ele.
		 * 2. Calcular a soma dos números de 1 a 15.
		 * 3. Ler um número inteiro e escrever a soma dos números pares de 2 até ele.
		 * 4. Ler a idade de 10 pessoas e imprimir a média das idades. 
		 */
		
		int numero1, numero2;
		@SuppressWarnings("resource")
		Scanner ler_teclado = new Scanner(System.in);
		
		//-- 1
		System.out.println("*** Exercício 1 : Números pares anteriores ***");
		System.out.println("Digite um número : ");
		numero1 = ler_teclado.nextInt();
		System.out.println("Números pares (positivos) anteriores a : " + numero1 + " : ");
		for (int i = numero1; i <= numero1 && i > 0; i--) {
			if (i%2 == 0) {
				System.out.print(i + " , ");
			}
		}
		
		//-- 2
		System.out.println("");
		System.out.println("*** Exercício 2 : Soma dos números de 1 a 15 ***");
		numero2 = 0;
		for (int i=1; i <= 15; i++) {
			System.out.print(i);
			if (i<15) { System.out.print(" + "); }
			numero2 += i;
		}
		System.out.println(" = " + numero2);

		//-- 3
		System.out.println("");
		System.out.println("*** Exercício 3 : Soma dos números pares de 2 até o número lido ***");
		System.out.println("Digite um número : ");
		numero1 = ler_teclado.nextInt();
		numero2 = 0;
		for (int i=2; i<=numero1; i++) {
			if (i%2==0) {
				numero2 += i;
				System.out.print(i);
				if (i+1 < numero1) { System.out.print(" + "); }
			}
		}
		System.out.println(" = " + numero2);
		
		//-- 4
		System.out.println("");
		System.out.println("*** Exercício 4 : Ler a idade de 10 pessoas e imprimir a média ***");
		numero2 = 0;
		for (int i=1; i<=10; i++) {
			System.out.println("Digite a idade número " + i + " : ");
			numero1 = ler_teclado.nextInt();
			numero2 += numero1;
		}
		System.out.println("A média das 10 idades informadas é : " + numero2/10);
		
	}

}
