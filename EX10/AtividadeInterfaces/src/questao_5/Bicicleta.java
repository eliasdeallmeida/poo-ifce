package questao_5;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {
	private int numeroRaios;
	
	public int getNumeroRaios() {
		return numeroRaios;
	}

	public void setNumeroRaios(int numeroRaios) {
		this.numeroRaios = numeroRaios;
	}
	
	public boolean estaParado() {
		return true;
	}
	
	public void curvar(float angulo) {}
	
	public void pedalar() {}
}
