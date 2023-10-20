package main;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
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
		
		teste(diretor);
		teste(aluno);
		teste(secretario);
		
		
		
	}
	
	public static  void teste(Pessoa pessoa) {
		System.out.println(pessoa.dadosPessoa());
	}
}
