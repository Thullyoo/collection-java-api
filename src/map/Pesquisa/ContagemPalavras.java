package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map<String, Integer> mapPalavras;
	
	public ContagemPalavras() {
		this.mapPalavras = new HashMap<>();
	}
	public void adicionarPalavras(String palavra, Integer contagem) {
		mapPalavras.put(palavra, contagem);
	}
	public void removerPalavra(String palavra) {
		mapPalavras.remove(palavra);
	}
	public int exibirContagemPalavras() {
		return mapPalavras.size();
	}
	public String encontrarPalavraMaisFrequente() {
		String palavraMaisRecente = null;
		int maiorContagem = 0;
		for (Map.Entry<String, Integer> entry : mapPalavras.entrySet()) {
			if (entry.getValue() > maiorContagem) {
				maiorContagem= entry.getValue();
				palavraMaisRecente = entry.getKey();
			}
			
		}
		return palavraMaisRecente;
	}
	public static void main(String[] args) {
		
		ContagemPalavras contagemLinguagens = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
	    contagemLinguagens.adicionarPalavras("Java", 2);
	    contagemLinguagens.adicionarPalavras("Python", 8);
	    contagemLinguagens.adicionarPalavras("JavaScript", 1);
	    contagemLinguagens.adicionarPalavras("C#", 6);

	    // Exibe a contagem total de linguagens
	    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

	    // Encontra e exibe a linguagem mais frequente
	    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
	    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	  }
}
