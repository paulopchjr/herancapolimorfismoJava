package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno  extends Pessoa{

	private String ra;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	@Override
	public boolean retornaIdade() {
		// TODO Auto-generated method stub
		return super.retornaIdade();
	}
	
	
	public String  Maioridade() {
		return this.retornaIdade() ? " Aluno é maior de idade" : " Aluno é menor de idade";
	}
	

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1200;
	}
	
	
	

}
