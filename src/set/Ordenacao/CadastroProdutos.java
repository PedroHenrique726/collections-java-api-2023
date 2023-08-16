package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtosSet;

	public CadastroProdutos() {
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int qtde ) {
		produtosSet.add(new Produto(nome, cod, preco, qtde));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
	}
	
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoPorPreco);
		return produtoPorPreco;
	}
	
	 public static void main(String[] args) {
		    CadastroProdutos cadastroProdutos = new CadastroProdutos();

		    cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
		    cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
		    cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
		    cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

		    System.out.println(cadastroProdutos.produtosSet);

		    System.out.println(cadastroProdutos.exibirProdutosPorNome());

		    System.out.println(cadastroProdutos.exibirPorPreco());
		  }
}
