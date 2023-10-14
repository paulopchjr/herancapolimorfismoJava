package main;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class Inicio {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Paulo");
		aluno.setRa("514545");
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("João");
		diretor.setTitulacao("31313131");
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jessíca");
		secretario.setNivelCargo("gerente");
		
		
		
		System.out.println("Nome do Aluno é :" + aluno.getNome() + " RA: " + aluno.getRa());
		
		System.out.println("O Nome do Diretor é : " + diretor.getNome() + " titulação" +diretor.getTitulacao());
		
		System.out.println("O nome da secretária é : " + secretario.getNome() + " o seu cargo é : " + secretario.getNivelCargo());
		
		
		
	}

}
