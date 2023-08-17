package Map.Pesquisa;

public class Produto {
	
	private String nome;
	private double preco;
	private int qtde;
	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;

	}
	public int getQtde() {
		return qtde;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtde=" + qtde + "]";
	}
	
	
	

}
