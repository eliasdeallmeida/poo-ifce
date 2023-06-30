package questao_5;

public abstract class TransporteAereo extends Transporte {
	private int altitudeAtual;
	
	public int getAltitudeAtual() {
		return altitudeAtual;
	}

	public void setAltitudeAtual(int altitudeAtual) {
		this.altitudeAtual = altitudeAtual;
	}
	
	public abstract void subir(int metros);
	public abstract void descer(int metros);
}
