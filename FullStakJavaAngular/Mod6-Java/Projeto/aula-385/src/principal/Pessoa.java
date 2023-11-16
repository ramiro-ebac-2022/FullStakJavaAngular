package principal;

public class Pessoa {

	public String cpf;
	public String nome;
	public String sexo;
	public int idade;
	
	void msgPessoa() {
		System.out.println("Olá " + this.nome);
	}
}
