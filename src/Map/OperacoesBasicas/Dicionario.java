package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
		
	}
	
	public void removerPalavra(String palavra) {
		dicionarioMap.remove(palavra);
	}
	
	
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	
	public String pesquisarPorPalavra(String palavra) {
		String descricao = null;
		if(!dicionarioMap.isEmpty()) {
			descricao = dicionarioMap.get(palavra);
		}
		
		return descricao;
	}
	
	public static void main(String[] args) {
	    Dicionario dicionario = new Dicionario();

	    // Adicionar palavras
	    dicionario.adicionarPalavra("maçã", "Fruta comestível de polpa suculenta e sabor doce.");
	    dicionario.adicionarPalavra("casa", "Lugar onde alguém mora.");

	    // Exibir todas as palavras
	    dicionario.exibirPalavras();

	    // Pesquisar uma palavra
	    String definicaoMaca = dicionario.pesquisarPorPalavra("maçã");
	    System.out.println("Definição da palavra 'maçã': " + definicaoMaca);
	    String definicaoUva = dicionario.pesquisarPorPalavra("uva");
	    System.out.println("Definição da palavra 'uva': " + definicaoUva);

	    // Remover uma palavra
	    dicionario.removerPalavra("casa");
	    System.out.println("Após remover a palavra 'casa':");
	    dicionario.exibirPalavras();
	  }
	
}
