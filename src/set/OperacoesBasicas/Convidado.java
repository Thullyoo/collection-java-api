package set.OperacoesBasicas;

public class Convidado {
	
	private String nome;
	private Integer codeConvite;
	
	public Convidado(String nome, Integer convite) {
		this.nome = nome;
		this.codeConvite = convite;
	}
	public String getNome() {
		return nome;
	}
	public Integer getConvite() {
		return codeConvite;
	}
	public String toString() {
		return nome + " " + codeConvite;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Convidado convidado)) return false;
		return getConvite() == 	convidado.getConvite();
	}
}
