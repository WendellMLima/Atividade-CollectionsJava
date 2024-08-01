package OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	public Set<Produtos> produtosSet;

	public CadastroProdutos() {
		this.produtosSet = new HashSet<>();
		
	}
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtosSet.add(new Produtos(codigo, nome, preco, quantidade));
		
	}
	
	public Set<Produtos> exibirProdutosPorNome(){
		Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
		
	}
	
	public Set<Produtos> exibirProdutosPorPreco(){
		Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	
	}
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
		cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
		cadastroProdutos.adicionarProduto(3L, "Produto 3", 10d, 2);
		cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}

}
