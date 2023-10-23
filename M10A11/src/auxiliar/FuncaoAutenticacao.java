package auxiliar;

import interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

	/* Criando um atributo da interface */
	private PermitirAcesso permitirAcesso;

	/* Construtor da classe FuncaoAutenticacao com paramentros */
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		// atribuindo o acesso no atributo
		this.permitirAcesso = acesso;
	}
	
	
	public boolean autenticarFuncaoAcesso() {
		return permitirAcesso.autenticar();
	}

}
