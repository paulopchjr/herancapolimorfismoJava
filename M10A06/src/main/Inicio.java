package main;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class Inicio {

	public static void main(String[] args) {
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Prezébiu");
		diretor.setIdade(45);
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Franjuana");
		aluno.setIdade(25);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Tilandra");
		secretario.setNivelCargo("Junior");
		secretario.setIdade(42);
		
		
		System.out.println(diretor.dadosDiretor());
		System.out.println("\n********************\n");
		System.out.print(aluno.dadosAluno());
		System.out.println("\n********************\n");
		System.out.printf(secretario.dadosSecretario());
		
		
		
	}
}
