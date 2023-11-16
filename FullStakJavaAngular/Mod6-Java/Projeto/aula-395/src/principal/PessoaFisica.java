package principal;

public class PessoaFisica extends Pessoa {

	private String rg;
	private String sexo;
	
	public PessoaFisica(String nome, int idade, String rg, String sexo) {
		super(nome, idade);
		this.rg = rg;
		this.sexo = sexo;
	}

	public void mostrarNome() {
		System.out.println("Nome da pessoa física : " + this.getNome() + ". Bem-vindo !");
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
}
