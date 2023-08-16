package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}else {
			System.out.println("Contato não encontrado");
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		
		return numeroPorNome;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		
		agenda.adicionarContato("Camila", 123456);
		agenda.adicionarContato("Camila", 5665);
		agenda.adicionarContato("Camila Cavalcante", 11111111);
		agenda.adicionarContato("Camila Dio", 654987);
		agenda.adicionarContato("Maria Silva", 11111111);
		agenda.adicionarContato("Camila", 444444);
		
		
		agenda.exibirContato();
		
		agenda.removerContato("Maria Silva");
		agenda.exibirContato();
		
		System.out.println("O numero é: " + agenda.pesquisarPorNome("Camila Dio"));
	}
}
