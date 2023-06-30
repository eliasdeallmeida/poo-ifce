package entidade;

import java.util.List;

public class Trem extends RecursoFerroviario {
	private String prefixo;
	private String dataDeFormacao;
	private EstacaoFerroviaria estacaoOrigem;
	private EstacaoFerroviaria estacaoDestino;
	private List<RecursoFerroviario> recursosFerroviarios;

	public String getPrefixo() {
		return this.prefixo;
	}

	public String getDataDeFormacao() {
		return this.dataDeFormacao;
	}

	public EstacaoFerroviaria getEstacaoOrigem() {
		return this.estacaoOrigem;
	}

	public EstacaoFerroviaria getEstacaoDestino() {
		return this.estacaoDestino;
	}

	public List<RecursoFerroviario> getRecursosFerroviarios() {
		return this.recursosFerroviarios;
	}
	
	public Trem(String prefixo, String dataDeFormacao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino, List<RecursoFerroviario> recursosFerroviarios) throws Exception {
		if(estacaoOrigem.equals(estacaoDestino)) {
			throw new Exception("ERRO: Estação de origem não pode ser igual à estacão de destino.");
		}
		if(recursosFerroviarios.size() > 150) {
			throw new Exception("ERRO: Um trem não pode ter mais de 150 recursos ferroviários.");
		}
		this.prefixo = prefixo;
		this.dataDeFormacao = dataDeFormacao;
		this.estacaoOrigem = estacaoOrigem;
		this.estacaoDestino = estacaoDestino;
		this.recursosFerroviarios = recursosFerroviarios;
	}
}
