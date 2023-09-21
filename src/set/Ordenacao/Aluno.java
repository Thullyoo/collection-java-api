package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double media;
	
	public Aluno(String nome, long matricula, double media) {
		this.matricula = matricula;
		this.media = media;
		this.nome = nome;
	}
	@Override
	public int compareTo(Aluno a) {
		return nome.compareTo(a.getNome());
	}
	
	public long getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public double getMedia() {
		return media;
	}	
	@Override
	public String toString() {
		return "Aluno{" +
		        "nome='" + nome + '\'' +
		        ", matricula=" + matricula +
		        ", media=" + media +
		        '}';
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Aluno aluno)) return false;
	    return Objects.equals(getMatricula(), aluno.getMatricula());
	}
}
	class ComparatorNota implements Comparator<Aluno>{
		
		public int compare(Aluno a1, Aluno a2) {
			return Double.compare(a1.getMedia(), a2.getMedia());
		}
	}

