package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
		
	}
	
	public void removerConvidadoCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigo() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidado = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);
		
		System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidado.removerConvidadoCodigoConvite(1234);
		
		System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidado.exibirConvidados();
			
		
	}
	
}
