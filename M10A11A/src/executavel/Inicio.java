package executavel;

import javax.swing.JOptionPane;

import auxilio.FuncaoAutenticacao;
import classes.Diretor;
import classes.Secretario;
import interfaces.PermissaoAcesso;

public class Inicio {

	public static void main(String[] args) {

		String loginTela = JOptionPane.showInputDialog("Informe o login");
		String senhaTela = JOptionPane.showInputDialog("Informe a senha");

		PermissaoAcesso permissaoAcesso = new Secretario(senhaTela, senhaTela);
		PermissaoAcesso permissaoAcessoDiretor = new Diretor(loginTela, senhaTela);
		
		if (new FuncaoAutenticacao(permissaoAcesso).autenticarFuncaoAcesso()
				|| new FuncaoAutenticacao(permissaoAcessoDiretor).autenticarFuncaoAcesso()) {
			JOptionPane.showMessageDialog(null, "Acessado");
		} else {
			JOptionPane.showMessageDialog(null, "Não foi acessado");
		}

	}
}
