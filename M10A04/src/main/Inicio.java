package main;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class Inicio {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jatoba");
		aluno.setIdade(12);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("okoka");
		diretor.setIdade(21);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Antonia");
		secretario.setIdade(21);
		
		System.out.println("Nome do Aluno:" +aluno.getNome() +"\n Idade: "+aluno.getIdade() +"\n" +aluno.alunoMaiorIdade());
		System.out.println("Nome do Diretor:" +diretor.getNome() +"\n Idade: "+diretor.getIdade() +"\n" +diretor.AptoouNaoParaDiretor());
		System.out.println("Nome:" +secretario.getNome() +"\n Idade: "+secretario.getIdade() + "\nResultado: " + secretario.requistoIdadeSecretario());
	}

}
