package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Crie uma variável que some dois valores informados pelo usuário.
		 * 2. Use o operador de incremento e some uma variável.
		 * 3. Crie uma variável e faça o decremento.
		 * 4. Faça um programa que calcule a soma, substração e multiplicação de 2 números.
		 * 5. Solicite ao usuário informar 3 valores, salve em 3 variáveis e faça cálculos com elas.
		 */
		
		int numero1, numero2, numero3;
		@SuppressWarnings("resource")
		Scanner ler_numero = new Scanner(System.in);
		
		//-- 1 --
		System.out.println("*** Exercício 1 : Soma de 2 números***");
		System.out.println("Digite o primeiro número : ");
		numero1 = ler_numero.nextInt();
		System.out.println("Digite o segundo número : ");
		numero2 = ler_numero.nextInt();
		System.out.printf("A soma dos números %d e %d é : %d", numero1, numero2, numero1+numero2);
		System.out.println("");
		
		//-- 2 --
		System.out.println("*** Exercício 2 : Incremento em 1 ***");
		System.out.println("Digite um número : ");
		numero1 = ler_numero.nextInt();
		System.out.printf("Incrementando em 1 : ++%d = %d",numero1 ,++numero1);
		System.out.println("");
		
		//-- 3 --
		System.out.println("*** Exercício 3 : Decremento em 1 ***");
		System.out.println("Digite um número : ");
		numero1 = ler_numero.nextInt();
		System.out.printf("Decrementando em 1 : --%d = %d",numero1 ,--numero1);
		System.out.println("");
		
		//-- 4 --
		System.out.println("*** Exercício 4 : soma, substração e multiplicação de 2 números ***");
		System.out.println("Digite o primeiro número : ");
		numero1 = ler_numero.nextInt();
		System.out.println("Digite o segundo número : ");
		numero2 = ler_numero.nextInt();
		System.out.printf("%d + %d = %d \n %d - %d = %d \n %d * %d = %d",
						   numero1,numero2,numero1+numero2,
						   numero1,numero2,numero1-numero2,
						   numero1,numero2,numero1*numero2);
		System.out.println("");
		
		//-- 5 --
		System.out.println("*** Exercício 5 : cálculos com 3 números ***");
		System.out.println("Digite o primeiro número : ");
		numero1 = ler_numero.nextInt();
		System.out.println("Digite o segundo número : ");
		numero2 = ler_numero.nextInt();
		System.out.println("Digite o terceiro número : ");
		numero3 = ler_numero.nextInt();
		System.out.printf("%d + %d + %d = %d \n %d - %d - %d = %d \n %d * %d * %d = %d ",
						   numero1,numero2,numero3,numero1+numero2+numero3,
						   numero1,numero2,numero3,numero1-numero2-numero3,
						   numero1,numero2,numero3,numero1*numero2*numero3);
		System.out.println("");

	}

}
