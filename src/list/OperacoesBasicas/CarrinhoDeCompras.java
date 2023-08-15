package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item item : itemList) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
				
			}
		}
		
		itemList.removeAll(itensParaRemover);			
	}
		
	public double calcularValorTotal() {
		double total = 0;
		
		for(Item item: itemList) {
			total += item.getPreco() * item.getQtde();
		}		
		return total;
		}
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
		carrinho.adicionarItem("Moto", 500.0, 2);
		System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
		carrinho.adicionarItem("Carro", 2000.0, 1);
		carrinho.adicionarItem("Carro", 2000.0, 1);
		System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
		carrinho.exibirItens();
		carrinho.removerItem("Carro");
		System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
		
	}
	
}
