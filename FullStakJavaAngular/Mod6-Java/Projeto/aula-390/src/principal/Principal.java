package principal;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Criar uma classe com atributos encapsulados, os mesmos devem ser chamados na classe "main", 
		 *    para isso deve criar os Getters e Setters.
		 * 2. Crie uma classe onde seu construtor tenha a mensagem "Olá Mundo!". 
		 * 	  Mostre a mensagem na classe principal.
		 * 3. Desenvolva uma classe com 2 construtores; o primeiro deve mostrar uma mensagem qualquer,
		 *    e o outro deve receber dois parâmetros (int n1 e int n2). 
		 *    Faça um cálculo e retorne o resultado para o usuário.   
		 */

		//-- 1 : 
		System.out.println("*** 1 : Classe com atributos encapsulados (Pessoa)  ***");
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Ramiro Arce");
		pessoa1.setIdade(35);
		System.out.println("Seu nome é :" + pessoa1.getNome() + ", e sua idade é : "+ pessoa1.getIdade());
		
		//-- 2 : 
		System.out.println("*** 2 : Classe com mensagem no construtor (Animal)  ***");
		Animal animal1 = new Animal();
		
		//-- 3 : 
		System.out.println("*** 3 : Classe com dois construtores (Aluno) ***");
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno(7,8);
		aluno2.operacoes();
		
	}

}
