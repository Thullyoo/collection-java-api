package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
	private Map<String, Livro> mapLivros;
	
	public LivrariaOnline() {
		this.mapLivros = new HashMap<>();
	}
	public void adicionarLivro(String link, Livro livro){
		mapLivros.put(link, livro);
	}
	public void removerLivro(String titulo) {
		Livro livroParaRemover = null;
		for (Livro l : mapLivros.values()) {
			if(l.getTitulo() == titulo) {
				livroParaRemover = l;
				break;
			}
		}
		mapLivros.remove(livroParaRemover);
	}
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
		List<Map.Entry<String, Livro>> listaLivrosOrdenadosPorPreco = new ArrayList<>(mapLivros.entrySet());
		Collections.sort(listaLivrosOrdenadosPorPreco, new ComparatorPorPreco());
		
		Map<String, Livro> listaOrdenadaPorPreco = new LinkedHashMap<>();
		
		for (Map.Entry<String, Livro> l : listaLivrosOrdenadosPorPreco) {
			listaOrdenadaPorPreco.put(l.getKey(), l.getValue());
		}
		return listaOrdenadaPorPreco;
	}
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
		List<Map.Entry<String, Livro>> listaLivrosOrdenadosPorAutor = new ArrayList<>(mapLivros.entrySet());
		Collections.sort(listaLivrosOrdenadosPorAutor, new ComparatorPorAutor());
		
		Map<String, Livro> listaOrdenadaPorAutor = new LinkedHashMap<>();
		
		for (Map.Entry<String, Livro> l : listaLivrosOrdenadosPorAutor) {
			listaOrdenadaPorAutor.put(l.getKey(), l.getValue());
		}
		return listaOrdenadaPorAutor;
	}
	public  List<Livro> pesquisarLivrosPorAutor(String autor){
		List<Livro> listaDeLivrosPorAutor = new ArrayList<>();
		for(Livro l : mapLivros.values()) {
			if(l.getAutor() == autor) {
				listaDeLivrosPorAutor.add(l);
			}
		}
		return listaDeLivrosPorAutor;
	}
	public List<Livro> obterLivroMaisCaro() {
		List<Livro> livrosMaisCaros = new ArrayList<>();
		double maiorPreco = Double.MIN_VALUE;
		for (Map.Entry<String, Livro> entry : mapLivros.entrySet()) {
			if( maiorPreco < entry.getValue().getPreco()) {
				maiorPreco = entry.getValue().getPreco();
			}
		}
		for (Map.Entry<String, Livro> l : mapLivros.entrySet()) {
			if (maiorPreco == l.getValue().getPreco()) {
				 Livro livroComPrecoMaisAlto = mapLivros.get(l.getKey());
			     livrosMaisCaros.add(livroComPrecoMaisAlto);
			}
		}
		return livrosMaisCaros;
	}
	public List<Livro> obterLivroMaisBarato() {
		List<Livro> livrosMaisBarato = new ArrayList<>();
		double menorPreco = Double.MAX_VALUE;
		for (Map.Entry<String, Livro> entry : mapLivros.entrySet()) {
			if( menorPreco > entry.getValue().getPreco()) {
				menorPreco = entry.getValue().getPreco();
			}
		}
		for (Map.Entry<String, Livro> l : mapLivros.entrySet()) {
			if (menorPreco == l.getValue().getPreco()) {
				 Livro livroComPrecoMaisBarato = mapLivros.get(l.getKey());
			     livrosMaisBarato.add(livroComPrecoMaisBarato);
			}
		}
		return livrosMaisBarato;
	}
	 public static void main(String[] args) {
		 
		    LivrariaOnline livrariaOnline = new LivrariaOnline();
		    // Adiciona os livros à livraria online
		    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
		    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
		    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
		    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
		    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
		    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

		    // Exibe todos os livros ordenados por preço
		    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

		    //Exibe todos os livros ordenados por autor
		    System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

		    // Pesquisa livros por autor
		    String autorPesquisa = "Josh Malerman";
		    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

		    // Obtém e exibe o livro mais caro
		    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

		    // Obtém e exibe o livro mais barato
		    System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

		    // Remover um livro pelo título
		    livrariaOnline.removerLivro("1984");
		    System.out.println(livrariaOnline.mapLivros);

		  }
}
