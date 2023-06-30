package questao_5;

public class Balao extends TransporteAereo {
	private int pesoLargada;
	
	public int getPesoLargada() {
		return pesoLargada;
	}

	public void setPesoLargada(int pesoLargada) {
		this.pesoLargada = pesoLargada;
	}

	public boolean estaParado() {
		return true;
	}
	
	public void subir(int metros) {
		System.out.println("Subindo " + metros + " metros");
	}
	
	public void descer(int metros) {
		System.out.println("Descendo " + metros + " metros");
	}
	
	public void largarPeso(float peso) {
		System.out.println("Largando " + peso + " kg");
	}
	
	public void aquecerAr(float temp) {
		System.out.println("Aquecendo " + temp + "°C");
	}
}
