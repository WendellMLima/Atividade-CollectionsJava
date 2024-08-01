package OrdenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	

	
	
	public Produtos(long codigo, String nome, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	@Override
	public int compareTo(Produtos p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

	
	public String getNome() {
		return nome;
	}

	
	public long getCodigo() {
		return codigo;
	}


	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return codigo == other.codigo;
	}

	class ComparatorPorPreco implements Comparator<Produtos> {

		@Override
		public int compare(Produtos p1, Produtos p2) {
			return Double.compare(p1.getPreco(), p2.getPreco());
			
		}

	}	

}	
	
	


