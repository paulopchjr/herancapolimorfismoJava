package classes;

import interfaces.PermissaoAcesso;

public class Diretor extends Pessoa implements PermissaoAcesso {

	private String registroDiretor;

	private String loginDiretor;
	private String senhaDiretor;

	public Diretor(String login, String senha) {
		this.loginDiretor = login;
		this.senhaDiretor = senha;

	}

	public String getRegistroDiretor() {
		return registroDiretor;
	}

	public void setRegistroDiretor(String registroDiretor) {
		this.registroDiretor = registroDiretor;
	}

	public String getLoginDiretor() {
		return loginDiretor;
	}

	public void setLoginDiretor(String loginDiretor) {
		this.loginDiretor = loginDiretor;
	}

	public String getSenhaDiretor() {
		return senhaDiretor;
	}

	public void setSenhaDiretor(String senhaDiretor) {
		this.senhaDiretor = senhaDiretor;
	}

	@Override
	public double salario() {

		return 5000;
	}

	public String dadosDiretor() {
		String dados = "";
		dados += "Nome: " + super.getNome() + "\n";
		dados += "Idade: " + getIdade() + "\n";
		dados += " Salário" + this.salario();
		return dados;

	}

	@Override
	public boolean autenticar() {
		
		return loginDiretor.equals("dir") && senhaDiretor.equals("dir");
	}

}
