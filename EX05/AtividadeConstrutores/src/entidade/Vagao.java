package entidade;

public class Vagao extends RecursoFerroviario {
	private String tipo;
	private double capacidadeDeCarga;
	private double comprimentoEntreTesteiras;
	private double comprimentoDosEngates;

	public String getTipo() {
		return this.tipo;
	}

	public double getCapacidadeDeCarga() {
		return this.capacidadeDeCarga;
	}

	public double getComprimentoEntreTesteiras() {
		return this.comprimentoEntreTesteiras;
	}

	public double getComprimentoDosEngates() {
		return this.comprimentoDosEngates;
	}
	
	public Vagao() {}
	
	public Vagao(String numeroDeSerie, String tipo, double capacidadeDeCarga,double comprimentoEntreTesteiras, double comprimentoDosEngates) {
		super(numeroDeSerie);
		this.tipo = tipo;
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.comprimentoEntreTesteiras = comprimentoEntreTesteiras;
		this.comprimentoDosEngates = comprimentoDosEngates;
	}
}
