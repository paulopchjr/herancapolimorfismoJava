package main;

import javax.swing.JOptionPane;

import classes.Secretario;

public class Inicio {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha:");

		/*
		 * Interface implementada na classe secretario, realiza a autenticacao de login
		 */
		if (new Secretario().autenticar(login, senha)) {
			JOptionPane.showMessageDialog(null, "Entrou no sistema");
		} else {
			JOptionPane.showMessageDialog(null, "Ascesso inválido");
		}

	}

}
