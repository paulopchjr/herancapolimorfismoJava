package classes;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registroSecr;
	private String nivelCargo;

	public String getRegistroSecr() {
		return registroSecr;
	}

	public void setRegistroSecr(String registroSecr) {
		this.registroSecr = registroSecr;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	@Override
	public boolean retornaIdade() {
		// TODO Auto-generated method stub
		return idade >= 25;
	}

	public String statusSecretario() {
		return this.retornaIdade()
				? " Você tem a idade de: " + idade + " tem a idade minima para o requisito de secretario(a)"
				: " Você tem a idade de: " + idade + " por tanto não tem a idade minima para ser secretário(a)";

	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 2759;
	}

	public String dadosSecretario() {
		String dados = "";
		dados += "Secretário: " + getNome() + "\n";
		dados += "idade:" + super.idade + "\n";
		dados += "Nivel de cargo:" + nivelCargo + "\n";
		dados += super.retornaIdade() ? dados = "Salário:" + this.salario() + "\n" : "";
		dados += statusSecretario();
		return dados;
	}

	@Override
	public boolean autenticar(String login, String senha) {

		return login.equals("admin") && senha.equals("admin");
	}

}
