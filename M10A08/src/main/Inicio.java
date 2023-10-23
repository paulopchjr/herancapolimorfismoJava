package main;

import javax.swing.JOptionPane;

import classes.Secretario;

public class Inicio {

	public static void main(String[] args) {

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha ");
			
			Secretario secretario = new Secretario();
			secretario.setLogin(login);
			secretario.setSenha(senha);
			
			if(secretario.autenticar()) {
				JOptionPane.showMessageDialog(null, "Entrou no sistema");
				
			}else {
				JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos");
			}
			
	}

}
