package LivrosCollections;

public class Livro {
	
	private String titulo;
	private String autor;
	private int AnoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		AnoPublicacao = anoPublicacao;
		
	}

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}

	
	public int getAnoPublicacao() {
		return AnoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", AnoPublicacao=" + AnoPublicacao + "]";
	}
	
	
	
	
	

}
