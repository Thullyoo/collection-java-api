package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoaList;
	
    public OrdenacaoPessoa() {
    	this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
    	pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordernarPorIdade(){
    		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    		if(!pessoaList.isEmpty()) {
    			Collections.sort(pessoasPorIdade);   			
    		}	
    		return pessoasPorIdade;
    }
    public List<Pessoa> ordernarPorAltura(){
    	List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    	if(!pessoaList.isEmpty()){
    		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    	}
    	return pessoasPorAltura;
    }
    public static void main(String[] args) {
		OrdenacaoPessoa listapessoas = new OrdenacaoPessoa();
		listapessoas.adicionarPessoa("Joao", 15, 1.70);
		listapessoas.adicionarPessoa("Felipe", 18, 1.60);
		listapessoas.adicionarPessoa("Maria", 20, 1.62);
		listapessoas.adicionarPessoa("Jorge", 20, 1.90);
		System.out.println(listapessoas.ordernarPorAltura());
		System.out.println(listapessoas.ordernarPorIdade());
	}
} 
