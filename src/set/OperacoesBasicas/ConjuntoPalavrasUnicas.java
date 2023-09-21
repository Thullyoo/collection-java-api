package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> setPalavras;
	
	public ConjuntoPalavrasUnicas() {
		this.setPalavras = new HashSet<>();
	}
	public void adicionarPalavra(String palavra) {
		setPalavras.add(palavra);
	}
	public void removerPalavra(String palavra) {
		String palavraRemover = null;
		for (String p : setPalavras) {
			if (p == palavra) {
				palavraRemover = p;
				break;
			}
		}
		setPalavras.remove(palavraRemover);
	}
	public void verificarPalavra(String palavra) {
		for (String p : setPalavras) {
			if (p == palavra) {
				System.out.println("Palavra "+ palavra + " está no set");
			} else {
				System.out.println("Palavra" + palavra + " não está no set");
			}
		}
	}
	public Set<String> exibirPalavrasUnicas() {
		return setPalavras;
	}
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
		System.out.println(palavras.exibirPalavrasUnicas());
		palavras.verificarPalavra("a");
		palavras.adicionarPalavra("a");
		palavras.verificarPalavra("a");
		System.out.println(palavras.exibirPalavrasUnicas());
		palavras.adicionarPalavra("a");
		palavras.adicionarPalavra("b");
		System.out.println(palavras.exibirPalavrasUnicas());
		palavras.removerPalavra("a");
		System.out.println(palavras.exibirPalavrasUnicas());
	}
}
