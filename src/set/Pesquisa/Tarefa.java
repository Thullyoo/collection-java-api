package set.Pesquisa;

public class Tarefa {
	private String descricao;
	private Boolean tarefaFeita;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.tarefaFeita = false;
	}
	public String getDescricao() {
		return descricao;
	}
	public Boolean getTarefaFeita() {
		return tarefaFeita;
	}
	public void setTarefaFeita(Boolean tarefaFeita) {
		this.tarefaFeita = tarefaFeita;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String toString() {
	    return "Tarefa{" +
	        "descricao='" + descricao + '\'' +
	        ", concluida=" + tarefaFeita +
	        '}';
	  }
}	
