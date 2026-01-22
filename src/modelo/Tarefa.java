package modelo;

public class Tarefa {

	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	public boolean concluir() {
		return concluida = true;
	}
	
	public String toString() {
		
		return concluida ? "[✔]" + descricao : "[ ]" + descricao; //operador ternario, se concluida for true: [OK] + descricao, se nao, [ ] + descricao
	}
}
