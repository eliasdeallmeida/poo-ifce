package entidade;

public class Locomotiva extends RecursoFerroviario {
	private double capacidadeDeTracao;
	private double comprimento;

	public double getCapacidadeDeTracao() {
		return this.capacidadeDeTracao;
	}

	public double getComprimento() {
		return this.comprimento;
	}
	
	public Locomotiva() {}
	
	public Locomotiva(String numeroDeSerie, double capacidadeDeTracao, double comprimento) {
		super(numeroDeSerie);
		this.capacidadeDeTracao = capacidadeDeTracao;
		this.comprimento = comprimento;
	}
}
