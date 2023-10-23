package classes;

import interfaces.PermissaoAcesso;

public class Secretario extends Pessoa implements PermissaoAcesso {

	private String nivelCargo;
	private String registro;

	private String loginSecretario;
	private String senhaSecretario;

	public Secretario(String login, String senha) {
		this.loginSecretario = login;
		this.senhaSecretario = senha;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getLoginSecretario() {
		return loginSecretario;
	}

	public void setLoginSecretario(String loginSecretario) {
		this.loginSecretario = loginSecretario;
	}

	public String getSenhaSecretario() {
		return senhaSecretario;
	}

	public void setSenhaSecretario(String senhaSecretario) {
		this.senhaSecretario = senhaSecretario;
	}

	@Override
	public boolean retornaIdade() {
		// TODO Auto-generated method stub
		return idade >= 25;
	}

	public String requistoSecretario() {
		return this.retornaIdade() ? "Você tem " + idade + " idade para ser secretário"
				: "Você não tem a idade suficiente: " + idade + " anos, \n volte daqui " + (25 - idade) + " anos";
	}

	public String dadosSecretario() {
		String dados = "";
		dados += "Nome: " + super.getNome() + "\n";
		dados += "Idade: " + getIdade() + "\n";
		dados += this.requistoSecretario() + "\n";
		dados += "Salário: " + this.salario();
		return dados;

	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3500;
	}

	@Override
	public boolean autenticar() {

		return loginSecretario.equals("admin") && senhaSecretario.equals("admin");
	}

}
