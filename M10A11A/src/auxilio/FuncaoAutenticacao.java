package auxilio;

import interfaces.PermissaoAcesso;

public class FuncaoAutenticacao {
	
	PermissaoAcesso permissaoAcesso;
	
	public FuncaoAutenticacao(PermissaoAcesso acesso) {
		this.permissaoAcesso = acesso;
	}
	
	public boolean autenticarFuncaoAcesso() {
		
		// retorna se a permisao é verdadeira ou nao
		return permissaoAcesso.autenticar();
	} 
	

}
