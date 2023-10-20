package classes;

public abstract class Pessoa {

	protected String nome;
	protected int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public abstract double salario();

	public boolean retornaIdade() {
		return idade >= 18;
	}
}