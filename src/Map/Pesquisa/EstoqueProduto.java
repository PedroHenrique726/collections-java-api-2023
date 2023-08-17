package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProduto() {
		this.estoqueProdutoMap = new HashMap<>();
	}
	
	public void adicionarProdutos(long cod, String nome, double preco, int qtde) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, qtde));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	public double calculaValorTotalEstoque() {
		double valorTotalEstoque = 0;
		
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQtde();
			}
		}
		return valorTotalEstoque;
	}
	
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(p.getPreco()>maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if(p.getPreco()<menorPreco) {
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
		double maiorQtdePreco = Double.MIN_VALUE;
		
		if(!estoqueProdutoMap.isEmpty()) {
			for(Produto p : estoqueProdutoMap.values()) {
				if((p.getPreco() * p.getQtde()) > maiorQtdePreco ) {
					produtoMaiorQuantidadeValorTotalNoEstoque = p;
				}
			}
		}
		return produtoMaiorQuantidadeValorTotalNoEstoque;
		
		
	}
	
	public static void main(String[] args) {
		EstoqueProduto estoque = new EstoqueProduto();
		estoque.exibirProdutos();
		
		estoque.adicionarProdutos(1L, "Produto A", 5.0, 10 );
		estoque.adicionarProdutos(2L, "Produto B", 10.0, 5 );
		estoque.adicionarProdutos(3L, "Produto C", 15.0, 2 );
		estoque.adicionarProdutos(8L, "Produto D", 20.0, 2 );
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total de estoque: R$" + estoque.calculaValorTotalEstoque());
		System.out.println("Produto mais caro: R$" + estoque.obterProdutoMaisCaro());
		System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}
	
	
}
