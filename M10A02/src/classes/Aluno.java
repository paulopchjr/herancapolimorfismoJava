package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno  extends Pessoa{ // SUBCLASSE, CLASSE FILHA QUE HERDA A HERANÇA DA CLASSE PAI
	private String ra;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	
	
	

}
