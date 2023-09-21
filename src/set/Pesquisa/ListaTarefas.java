package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
	private Set<Tarefa> listaTarefas;
	
	public ListaTarefas() {
			this.listaTarefas = new HashSet<>();
	}
	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		for (Tarefa t : listaTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				listaTarefas.remove(t);
				break;
			}
		}
	}
	public void exibirTarefas() {
		System.out.println(listaTarefas);
	}
	public int contarTarefas() {
		return listaTarefas.size();
	}
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : listaTarefas) {
			if(t.getTarefaFeita() == true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : listaTarefas) {
			if(t.getTarefaFeita() == false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : listaTarefas) {
			if (t.getDescricao() == descricao) {
				t.setTarefaFeita(true);
				break;
			}
		}
	}
	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : listaTarefas) {
			if (t.getDescricao() == descricao) {
				t.setTarefaFeita(false);
				break;
			}
		}
	}
	public void limparListaTarefas() {
		listaTarefas.removeAll(listaTarefas);
	}
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }
}
