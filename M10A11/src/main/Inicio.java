package main;

import javax.swing.JOptionPane;

import auxiliar.FuncaoAutenticacao;
import classes.Secretario;
import interfaces.PermitirAcesso;

public class Inicio {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha:");

		PermitirAcesso acesso = new Secretario(login, senha); /* recupera os dados de autenticação do secretario*/

		/* Autentica se a primeira autenticação está correta*/
		if (new FuncaoAutenticacao(acesso).autenticarFuncaoAcesso()) {
			JOptionPane.showMessageDialog(null, "Entrou no sistema");
		} else {
			JOptionPane.showMessageDialog(null, "Ascesso inválido");
		}

	}

}
