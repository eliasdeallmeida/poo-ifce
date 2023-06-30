package entidade;

import java.util.List;

public class LinhaFerroviaria {
	private int numero;
	private double extensao;
	private String descricao;

	public int getNumero() {
		return this.numero;
	}

	public double getExtensao() {
		return this.extensao;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public LinhaFerroviaria(int numero, double extensao, String descricao) {
		this.numero = numero;
		this.extensao = extensao;
		this.descricao = descricao;
	}
}
