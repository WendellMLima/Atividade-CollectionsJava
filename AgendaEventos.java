package OperacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
		
	}
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		
		System.out.println(eventosTreeMap);
	}
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
				break;
			}
		}
	}
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 8), "Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 2), "Evento 3", "Atracao 3");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();

	}
}
