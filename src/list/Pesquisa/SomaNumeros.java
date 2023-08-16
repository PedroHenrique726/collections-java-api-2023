package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int total = 0;
		
		for(Integer n : numeros) {
			total += n;
		}
		
		return total;
	}
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		
		for(Integer n : numeros) {
			if(n > maior) {
				maior = n;
			}
		}
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = numeros.get(0);
		if(!numeros.isEmpty()) {
			for(Integer n : numeros) {
				if (n < menor) {
					menor = n;					
				}
			}
		}
		return menor;
	}
	
	public List<Integer> exibirNumeros(){
		return numeros;
		
	}

	  public static void main(String[] args) {
		    SomaNumeros somaNumeros = new SomaNumeros();

		    somaNumeros.adicionarNumero(5);
		    somaNumeros.adicionarNumero(0);
		    somaNumeros.adicionarNumero(0);
		    somaNumeros.adicionarNumero(-2);
		    somaNumeros.adicionarNumero(10);
		    somaNumeros.exibirNumeros();

		    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

		    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

		    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
		  }
	
}
