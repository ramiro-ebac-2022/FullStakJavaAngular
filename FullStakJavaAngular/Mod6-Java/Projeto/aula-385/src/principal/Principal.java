package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Crie uma classe chamada Animal, a classe deve conter alguns atributos 
		 *    que devem ser mostrados na classe principal onde será instanciado o objeto.
		 * 2. Crie um classe com o nome Pessoa, e outra com o nome Colaborador. 
		 *    Após crie dois objetos (instâncias de cada classe) na classe principal.
		 * 3. Na classe Pessoa crie um método chamado msgPessoa que mostra a mensagem "Olá usuário".
		 *    Na classe principal instanciar a classe e chamar ao método msgPessoa.
		 * 4. Crie uma classe com o nome Pessoa, com os atributos nome e idade. 
		 *    Instanciar na classe principal e solicitar para o usuário digitar seu nome e idade.         
		 */

		//-- 1
		System.out.println("*** 1 : Classe Animal ***");
		Animal cachorro1 = new Animal();
		cachorro1.codigo = 1;
		cachorro1.especie = "Cão";
		cachorro1.raca = "Poodle";
		cachorro1.nome = "José";
		//
		java.lang.reflect.Field[] campos = cachorro1.getClass().getDeclaredFields();
		for (int i = 0; i < campos.length; i++) {
			try {
				campos[i].setAccessible(true);
				System.out.println(campos[i].getName() + " : " + campos[i].get(cachorro1));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		//-- 2
		System.out.println("*** 2 : Criar a instanciar as classes Pessoa e Colaborador ***");
		Pessoa pessoa1 = new Pessoa();
		pessoa1.cpf = "123456789";
		pessoa1.idade = 19;
		pessoa1.nome = "Maria";
		pessoa1.sexo = "Feminino";
		
		//
		Colaborador colaborador1 = new Colaborador();
		colaborador1.codigo = 100;
		colaborador1.cargo = "Analista";
		colaborador1.departamento = "Informática";
		
		//-- 3
		System.out.println("*** 3 : Método 'msgPessoa' na classe Pessoa ***");
		pessoa1.msgPessoa();
		
		//-- 4
		System.out.println("*** 3 : instanciar a classe Pessoa e solicitar digitar o nome e a idade ***");
		Pessoa pessoa2 = new Pessoa();
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe seu nome : ");
		pessoa2.nome = teclado.nextLine();
		System.out.println("informe sua idade : ");
		pessoa2.idade = teclado.nextInt();
		
		System.out.println("Seu nome é : " + pessoa2.nome + ", e sua idade é : " + pessoa2.idade);
		
	}	
}
