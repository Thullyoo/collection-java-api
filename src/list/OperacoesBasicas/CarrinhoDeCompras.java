package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> carrinhodecompras;
	
	public CarrinhoDeCompras() {
		this.carrinhodecompras = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhodecompras.add(new Item(nome,preco,quantidade));
	}
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item i : carrinhodecompras) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}	
		}
		this.carrinhodecompras.removeAll(itensParaRemover);
	}
	public double calcularValorTotal() {
		double valorTotal = 0;
		for(Item i : carrinhodecompras) {
			valorTotal += i.getPreco();
		}
	return valorTotal;	
	}
	public void exibirItens() {
		System.out.println(carrinhodecompras);
	}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("feijao", 10.0, 1);
		carrinho.adicionarItem("arroz", 5.0, 2);
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		carrinho.removerItem("arroz");
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		
	}
	}
