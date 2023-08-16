package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	List<Integer> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> listaOrdenada = new ArrayList<>(numeros);
		Collections.sort(listaOrdenada);		
		return listaOrdenada;
		}
	public List<Integer> ordenarDecrescendente(){
		List<Integer> listaOrdenada = new ArrayList<>(numeros);
		listaOrdenada.sort(Collections.reverseOrder());		
		return listaOrdenada;
		}
	
	public void exibirNumeros() {
		System.out.println(this.numeros);
	}
	
	 public static void main(String[] args) {
		    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

		    numeros.adicionarNumero(2);
		    numeros.adicionarNumero(5);
		    numeros.adicionarNumero(4);
		    numeros.adicionarNumero(1);
		    numeros.adicionarNumero(99);
		    numeros.exibirNumeros();

		    System.out.println(numeros.ordenarAscendente());
		    numeros.exibirNumeros();

		    System.out.println(numeros.ordenarDecrescendente());
		    numeros.exibirNumeros();
		  }
}
		

