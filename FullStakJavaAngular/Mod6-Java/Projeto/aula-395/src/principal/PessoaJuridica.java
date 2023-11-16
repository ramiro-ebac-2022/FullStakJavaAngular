package principal;

public class PessoaJuridica extends Pessoa {

	private String cpf_cnpj;
	private String telefone;
	
	public PessoaJuridica(String nome, int idade, String cpf_cnpj, String fone) {
		super(nome, idade);
		this.cpf_cnpj = cpf_cnpj;
		this.telefone = fone;
	}

	public void mostrarNome() {
		System.out.println("Nome da pessoa jurídica : " + this.getNome());
	}
	
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
