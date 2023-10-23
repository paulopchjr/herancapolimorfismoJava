package classes;

public class Diretor extends Pessoa {

	private String registroEducacional;

	public String getRegistroEducacional() {
		return registroEducacional;
	}

	public void setRegistroEducacional(String registroEducacional) {
		this.registroEducacional = registroEducacional;
	}
	
	
	@Override
	public boolean retornaIdade() {
	
		return idade >=35;
	}

	
	public String statusDiretor() {
		return this.retornaIdade() ? "Sua idade é de: "+idade+" anos, você pode ser para ser diretor." 
					: "A sua idade é de: "+idade+ " por tanto não pode ser diretor";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3500;
	}
	
	
	public String dadosDiretor() {
		
		String dados = "";
		
		dados+= "Diretor:"+ this.getNome() + "\n";
		dados+= "Idade:"+this.getIdade()+"\n";
		dados += this.retornaIdade() ? dados="Salário:"+this.salario() +"\n" : "";
		dados+= this.statusDiretor();
		
		return dados;
	}
	
	
}
