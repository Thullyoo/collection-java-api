package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	public List<Integer> listaNumeros;
	
	private Integer numeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	public Integer calcularSoma() {
		Integer soma = 0;
		if(!listaNumeros.isEmpty()) {
			for(Integer n : listaNumeros) {
				soma += n;
			}
		}	
		return soma;
	}
	public Integer encontrarMaiorNumero() {
		Integer maiorNumero = Integer.MIN_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer n : listaNumeros) {
				if(n > maiorNumero) {
					maiorNumero = n;
				}
			}
		}
		return maiorNumero;
	}
	public Integer encontrarMenorNumero() {
		Integer menorNumero = Integer.MAX_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer n : listaNumeros) {
				if(n < menorNumero) {
					menorNumero = n;
				}
			}
		}
		return menorNumero;
	}
	public void exibirNumeros() {
		System.out.println(listaNumeros);
	}
	public static void main(String[] args) {
		SomaNumeros listadenumeros = new SomaNumeros();
		listadenumeros.exibirNumeros();
		listadenumeros.adicionarNumero(7);
		listadenumeros.adicionarNumero(10);
		listadenumeros.adicionarNumero(16);
		listadenumeros.adicionarNumero(2);
		listadenumeros.adicionarNumero(-7);
		listadenumeros.adicionarNumero(500);
		listadenumeros.adicionarNumero(50);
		listadenumeros.adicionarNumero(90);
		listadenumeros.exibirNumeros();
		System.out.println(listadenumeros.encontrarMaiorNumero());
		System.out.println(listadenumeros.encontrarMenorNumero());
	}
}