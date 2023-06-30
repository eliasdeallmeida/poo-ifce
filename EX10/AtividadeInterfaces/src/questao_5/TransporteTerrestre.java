package questao_5;

public abstract class TransporteTerrestre extends Transporte {
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void estacionar() {
		System.out.println("Estacionando");
	}
}
