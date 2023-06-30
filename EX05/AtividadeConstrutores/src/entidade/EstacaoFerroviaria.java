package entidade;

import java.util.List;

public class EstacaoFerroviaria {
	private String sigla;
	private String descricao;
	private List<LinhaFerroviaria> linhasFerroviarias;
	private List<RecursoFerroviario> recursosFerroviarios;

	public String getSigla() {
		return this.sigla;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public List<LinhaFerroviaria> getLinhasFerroviarias() {
		return this.linhasFerroviarias;
	}

	public List<RecursoFerroviario> getRecursosFerroviarios() {
		return this.recursosFerroviarios;
	}
	
	public EstacaoFerroviaria(String sigla, String descricao, List linhasFerroviarias) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.linhasFerroviarias = linhasFerroviarias;
	}

	public EstacaoFerroviaria(String sigla, String descricao, List linhasFerroviarias, List recursosFerroviarios) {
		this(sigla, descricao, linhasFerroviarias);
		this.recursosFerroviarios = recursosFerroviarios;
	}
}
