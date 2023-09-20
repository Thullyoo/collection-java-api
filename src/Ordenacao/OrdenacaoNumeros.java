package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
	private List<Integer> numeros;
	
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
		if(!numeros.isEmpty()) {
			Collections.sort(numerosAscendente);
		} else {
			throw new RuntimeException("A lista está vazia");
		}
		return numerosAscendente;
	}
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDescedente= new ArrayList<>(this.numeros);
		if(!numeros.isEmpty()) {
			numerosDescedente.sort(Collections.reverseOrder());
		} else {
			throw new RuntimeException("A lista está vazia");
		}
		return numerosDescedente;
	}
	public void exibirNumeros() {
	    if (!numeros.isEmpty()) {
	      System.out.println(this.numeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		numeros.adicionarNumero(0);
		numeros.adicionarNumero(-7);
		numeros.adicionarNumero(8);
		numeros.adicionarNumero(10);
		numeros.adicionarNumero(-6);
		numeros.adicionarNumero(40);
		numeros.adicionarNumero(100);
		numeros.adicionarNumero(1);
		System.out.println(numeros.ordenarAscendente());
		System.out.println(numeros.ordenarDescendente());
	}
}	
