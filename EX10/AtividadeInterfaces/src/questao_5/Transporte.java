package questao_5;

public abstract class Transporte {
	private String nome;
	private String numeroPassageiros;
	private int velocidadeAtual;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(String numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public abstract boolean estaParado();
}
