package OperacaoMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		super();
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, int telefone) {
		agendaContatoMap.put(nome, telefone);
		
	
	}
	
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	public Integer pesquisaPorNome(String nome ) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("nome 1", 121);
		agendaContatos.adicionarContato("nome 2", 125);
		agendaContatos.adicionarContato("nome 3", 124);
		agendaContatos.adicionarContato("nome 4", 135);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("nome 1");
		
		agendaContatos.exibirContatos();
		
		System.out.println("O numero é " + agendaContatos.pesquisaPorNome("nome 3"));
	}
}
