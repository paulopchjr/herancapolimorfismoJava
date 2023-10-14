package classes;

public class Diretor extends Pessoa {// SUBCLASSE, CLASSE FILHA QUE HERDA A HERANÇA DA CLASSE PAI

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	
	@Override
		public boolean pessoaMaiorIdade() {
		
			return idade >=25;
		}
	
	public String AptoouNaoParaDiretor() {
	
		return this.pessoaMaiorIdade() ? "Você está apto para ser diretor" : "Você nao possui idade mininma para ser diretor";
	}
}
