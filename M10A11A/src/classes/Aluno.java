package classes;

public class Aluno extends Pessoa {

	private String ra;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public boolean retornaIdade() {

		return idade >= 18;
	}

	public String maiorIdade() {
		return this.retornaIdade() ? "Aluno é maior de idade" : "Aluno é menor de idade";
	}

	@Override
	public double salario() {
		return this.retornaIdade() ? 1200 : 0;
	}

	public String dadosAluno() {
		String dados = "";
		dados += "Nome: " + getNome() + "\n";
		dados += "Idade: " + getIdade() + "\n";
		dados += "Salário: " + this.salario() + "\n";
		dados += "Status Aluno: " + this.maiorIdade();

		return dados;
	}

}
