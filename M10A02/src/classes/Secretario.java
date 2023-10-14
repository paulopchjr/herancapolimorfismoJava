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

}
