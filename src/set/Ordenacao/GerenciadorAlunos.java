package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	 private Set<Aluno> setAlunos;
	 
	 public GerenciadorAlunos() {
		 this.setAlunos = new HashSet<>();
	 }
	 public void adicionarAluno(String nome, Long matricula, double media) {
		 setAlunos.add(new Aluno(nome,matricula,media));
	 }
	 public void removerAlunoPorMatricula(long matricula) {
		 Aluno alunoParaRemover = null;
		 for (Aluno a : setAlunos) {
			 if (a.getMatricula() == matricula) {
				 alunoParaRemover = a;
				 break;
			 }
		 }
		 setAlunos.remove(alunoParaRemover);
	 }
	 public void exibirAlunosPorNome(){
		 Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
		 System.out.println(alunosPorNome);
	 }
	 public void exibirAlunosPorNota() {
		 Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorNota());
		 alunosPorNome.addAll(setAlunos);	
		 System.out.println(alunosPorNome);
	 }
	 public void exibirAlunos() {
		 System.out.println(setAlunos);
	 }
	 public static void main(String[] args) {
		    // Criando uma instância do GerenciadorAlunos
		    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

		    // Adicionando alunos ao gerenciador
		    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
		    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
		    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
		    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

		    // Exibindo todos os alunos no gerenciador
		    System.out.println("Alunos no gerenciador:");
		    System.out.println(gerenciadorAlunos.setAlunos);

		    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
		    gerenciadorAlunos.removerAlunoPorMatricula(000L);
		    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
		    System.out.println(gerenciadorAlunos.setAlunos);

		    // Exibindo alunos ordenados por nome
		    gerenciadorAlunos.exibirAlunosPorNome();

		    // Exibindo alunos ordenados por nota
		    gerenciadorAlunos.exibirAlunosPorNota();
		  }
}
