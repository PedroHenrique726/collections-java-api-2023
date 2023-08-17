package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> contagemPalavrasMap;

	public ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		
		contagemPalavrasMap.put(palavra, contagem);
		
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemPalavrasMap.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
				if(entry.getKey() == palavra) {
					contagemPalavrasMap.remove(entry.getKey(), entry.getValue());
				}
			}
		}
	}
	
	public void exibirContagemPalavras() {

		if(!contagemPalavrasMap.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
				System.out.println("Palavra: " + entry.getKey() + ", contagem: " + entry.getValue());
			}
		}
	}
	
	public String encontrarPalavraMaisFrequente() {
		String palavra = "";
		int contagem = Integer.MIN_VALUE;
		if(!contagemPalavrasMap.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
				if(entry.getValue() > contagem) {
					contagem = entry.getValue();
					palavra = entry.getKey();
				}
			}
		}
		return palavra;
	}
	
	
	public static void main(String[] args) {
	    ContagemPalavras contagemPalavras = new ContagemPalavras();
	    contagemPalavras.adicionarPalavra("Palavra 1", 2);
	    contagemPalavras.adicionarPalavra("Palavra 2", 8);
	    contagemPalavras.adicionarPalavra("Palavra 3", 1);
	    contagemPalavras.adicionarPalavra("Palavra 4", 6);
	    contagemPalavras.exibirContagemPalavras();
	    System.out.println("-------------------");
	    contagemPalavras.removerPalavra("Palavra 4");
	    contagemPalavras.exibirContagemPalavras();
	    System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
	  }
	
	
	
}
