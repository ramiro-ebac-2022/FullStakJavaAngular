package principal;

public class Aluno {
	private int nota1;
	private int nota2;
	
	public Aluno() {
		System.out.println("Um aluno foi instanciado");
	}
	
	public Aluno(int n1, int n2) {
		this.nota1 = n1;
		this.nota2 = n2;
		System.out.println("Um aluno foi instanciado, com as notas n1 = " + n1 + ", n2 = " + n2);
	}
	
	public void operacoes() {
		System.out.println("Operações com as notas n1 = " + this.nota1 + ", n2 = " + this.nota2 + " : ");
		System.out.printf(" Soma : %d \n", this.nota1+this.nota2);
		System.out.printf(" Substração : %d \n", this.nota1-this.nota2);
		System.out.printf(" Multiplicação : %d \n",this.nota1*this.nota2);
	}

}
