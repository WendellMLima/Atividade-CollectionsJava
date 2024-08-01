package OperacaoMap;

public class Evento {
	private String atracao;
	private String nome;
	
	public Evento(String atracao, String nome) {
		this.atracao = atracao;
		this.nome = nome;
	}

	public String getAtracao() {
		return atracao;
	}


	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Evento [atracao=" + atracao + ", nome=" + nome + "]";
	}

	
	
}
