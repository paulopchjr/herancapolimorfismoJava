package classes;

public class Secretario extends Pessoa {// SUBCLASSE, CLASSE FILHA QUE HERDA A HERANÇA DA CLASSE PAI

	private String registro;
	private String nivelCargo;
	private String expericencia;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExpericencia() {
		return expericencia;
	}

	public void setExpericencia(String expericencia) {
		this.expericencia = expericencia;
	}

	@Override
	public boolean pessoaMaiorIdade() {

		return idade > 20;
	}

	public String requistoIdadeSecretario() {
		return this.pessoaMaiorIdade() ? "Pode conconrrer a secretária"
				: "Infelizmente não poderá conconrrer a sua idade é de " + this.getIdade();

	}
}
