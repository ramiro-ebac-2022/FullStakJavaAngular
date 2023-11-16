package principal;

public class Principal {

	public static void main(String[] args) {
		/**
		 * 1. Crie a classe Pessoa com os atributos de nome, idade. Crie também uma classe
		 *    PessoaFisica e PessoaJuridica, onde ambas herdam os atributos da classe Pessoa.
		 * 2. Crie a classe Animal que tenha um metodo que receba como parâmetro o nome do animal e sua idade. 
		 *    Crie um método com o mesmo nome recebendo atributos diferentes (criando uma sobrecarga).
		 * 3. Crie uma classe Pessoa com os atributos de nome, idade. 
		 *    Crie também uma classe PessoaFisica e PessoaJuridica, onde ambas herdam os atributos da classe Pessoa.
		 *    Criar o método "mostrarNome" nas classes :    
		 *    a) PessoaFisica :   o método mostrarNome (mostra o nome e envia a msg de boas vindas) ,
		 *    b) PessoaJuridica : o método mostrarNome (apenas mostra o nome que o usuário digitou) .
		 */

		//-- 1
		System.out.println("** 1 : Criando Pessoa, PessoaFisica, PessoaJuridica **");
		Pessoa pessoa = new Pessoa("José", 35);
		System.out.println("Pessoa - nome : " + pessoa.getNome() + " , idade : " + pessoa.getIdade());
		PessoaFisica pf = new PessoaFisica("María", 23, "RG-001", "Feminino");
		System.out.println("Pessoa Fisica - nome : " + pf.getNome() 
							+ " , idade : " + pf.getIdade() + " , RG : " + pf.getRg()
							+ " , sexo : " + pf.getSexo());
		PessoaJuridica pj = new PessoaJuridica("Antônio", 67, "123456789", "(81)98989898");
		System.out.println("Pessoa jurídica - nome : " + pj.getNome() 
							+ " , idade : " + pj.getIdade() + " , Cpf/Cnpj : " + pj.getCpf_cnpj()
							+ " , telefone : " + pj.getTelefone());
		
		//-- 2
		System.out.println("** 2 : Criando a classe Animal **");
		Animal cachorro = new Animal("Scooby",13);
		System.out.println("Animal com 2 parâmetros - nome : " 
							+ cachorro.getNome() + " , idade : " + cachorro.getIdade());
		Animal gato = new Animal("Garfield", 10, "Gato");
		System.out.println("Animal com 3 parâmetros - nome : " 
				+ gato.getNome() + " , idade : " + gato.getIdade() + " , espécie : " + gato.getEspecie());
		
		//-- 3
		System.out.println("** 3 : Criando 'mostrarNome' em Pessoa, PessoaFisica, PessoaJuridica **");
		pessoa.mostrarNome();
		pf.mostrarNome();
		pj.mostrarNome();
		
	}

}
