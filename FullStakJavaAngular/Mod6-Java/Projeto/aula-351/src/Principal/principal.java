package Principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/**
		 * 1. Crie uma classe que contenha uma declaração de variável inteira.
		 * 2. Crie uma variável String e atribua o valor "Soul On".
		 * 3. Crie variáveis int, double, boolean e atribua valores  elas.
		 * 4. Solicite para o usuário um número e salve em uma variável inteira.
		 * 5. Solicite ao usuário digitar seu nome e sobrenome, 
		 *    ambos devem ser salvos em variáveis diferentes. 
		 *    Mostrar na tela o nome e sobrenome do usuário. 
		 */
		
		// 1
		int minha_variavel;
		
		// 2
		String curso = "Soul On";
		
		// 3
		int var1 = 12;
		double var2 = 12.43;
		boolean var3 = true;
		
		// 4
		int numero;
		Scanner ler_numero = new Scanner(System.in);
		System.out.println("Digite um número : ");
		numero = ler_numero.nextInt();
		System.out.println("O número digitado foi :" + numero);
		
		// 5
		String nome, sobrenome;
		Scanner ler_string = new Scanner(System.in);
		System.out.println("Digite seu nome :");
		nome = ler_string.nextLine();
		System.out.println("Digite seu sobrenome :");
		sobrenome = ler_string.nextLine();
		System.out.println("O seu nome completo é : " + nome + " " + sobrenome);
		

	}

}
