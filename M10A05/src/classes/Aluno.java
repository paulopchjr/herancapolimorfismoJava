package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
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
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", disciplinas=" + disciplinas + "]";
	}
	
	
	@Override /*Identifica método sobreescrito*/
		public boolean pessoaMaiorIdade() {
			
			return super.pessoaMaiorIdade();
		}
	
	
	public String alunoMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno maior de 18 anos" : "Aluno menor de 18";
	}
	
	
	
	
	
	

}
