package OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OredenacaoPessoas {
	
	private List<Pessoa> pessoaList;

	public OredenacaoPessoas() {
		super();
		this.pessoaList = new ArrayList<>();
	}
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		
		return pessoaPorAltura;
		
	}
	public static void main(String[] args) {
		OredenacaoPessoas ordenacaoPessoa = new OredenacaoPessoas();
		
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 21, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 22, 1.60);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 23, 1.85);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());



	}
}
