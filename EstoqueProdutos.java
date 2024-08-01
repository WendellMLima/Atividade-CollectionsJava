package OperacaoMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutdosMap;

	public EstoqueProdutos() {
		this.estoqueProdutdosMap = new HashMap<>();
	}
	
	public void adicionarProcutos(long cod, String nome, int quantidade, double preco) {
		estoqueProdutdosMap.put(cod, new Produto(nome, quantidade, preco));
		
		
	}
	
	public void exibirProduto() {
		System.out.println(estoqueProdutdosMap);
	}
	public double calculaValorTotal() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutdosMap.isEmpty()) {
			for (Produto p : estoqueProdutdosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
			
		}
		return valorTotalEstoque;
	}
	
	public Produto obterValorMaior() {
		Produto maiorValorProduto = null;
		double valorMaior = Double.MIN_VALUE;
		if (!estoqueProdutdosMap.isEmpty()) {
		for (Produto p : estoqueProdutdosMap.values()) {
			if (p.getPreco() > valorMaior) {
				maiorValorProduto = p;
			}
			
		}
	}
		return maiorValorProduto;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProcutos(1L, "Produto 1", 10, 5.0);
		estoqueProdutos.adicionarProcutos(2L, "Produto 2", 14, 6.0);
		estoqueProdutos.adicionarProcutos(3L, "Produto 3", 15, 3.0);
		estoqueProdutos.adicionarProcutos(3L, "Produto 4", 20, 10.0);

		
		estoqueProdutos.exibirProduto();
		
		System.out.println("Valor total do estoque " + estoqueProdutos.calculaValorTotal());
		System.out.println("Produto mais caro " + estoqueProdutos.obterValorMaior());


	}
}
