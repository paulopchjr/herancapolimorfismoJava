package main;

import javax.swing.JOptionPane;

import classes.Secretario;
import interfaces.PermitirAcesso;

public class Inicio {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha:");

		PermitirAcesso acesso = new Secretario(login, senha);
		
		if (acesso.autenticar()) {
			JOptionPane.showMessageDialog(null, "Entrou no sistema");
		} else {
			JOptionPane.showMessageDialog(null, "Ascesso inválido");
		}

	}

}
