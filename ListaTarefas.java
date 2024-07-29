package OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	// atributo
	private List<Tarefa> tarefalist;

	public ListaTarefas() {
		this.tarefalist = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefalist.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefalist) {
			if (t.getdescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefalist.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas(){
		return tarefalist.size();		
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefalist);
	}
	
	public static void main(String[] args) {
		ListaTarefas listatarefa = new ListaTarefas();
		
		System.out.println("o numero total de numeros na lista é " + listatarefa.obterNumeroTotalTarefas());
		
		listatarefa.adicionarTarefa("Tarefa 1");
		listatarefa.adicionarTarefa("Tarefa 2");
		listatarefa.adicionarTarefa("Tarefa 1");
		System.out.println("o numero total de numeros na lista é " + listatarefa.obterNumeroTotalTarefas());
		
		listatarefa.removerTarefa("Tarefa 1");
		System.out.println("o numero total de numeros na lista é " + listatarefa.obterNumeroTotalTarefas());

		listatarefa.obterDescricaoTarefas();
	}

}
