package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	// atributos
	private Set<String> palavrasUnicasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		String palavraRemover = null;
		for(String p : palavrasUnicasSet) {
			if (p.equalsIgnoreCase(palavra)) {
				palavraRemover = p;
			}
		}
		palavrasUnicasSet.remove(palavraRemover);
	}

	public boolean verificarPalavra(String palavra) {
		boolean contem = false;
		for(String p : palavrasUnicasSet) {
			if(p.equalsIgnoreCase(palavra)) {
				contem = true;
				break;
			}else {
				contem = false;
			}
		}		
		return contem;
	}

	public void exibirPalavrasUnicas() {
			System.out.println(palavrasUnicasSet);
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

		conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
		conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
		conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
		conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
		conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();

		conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();

		conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
		System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
	}
}