package questao_5;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
	private int numeroMotores;
	
	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
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
	
	public void curvar(float angulo) {
		System.out.println("Curvando " + angulo + " °");
	}
	
	public void ligarMotor() {
		System.out.println("Ligando motor");
	}
	
	public void abastecer(int numLitros) {
		System.out.println("Abastecendo " + numLitros + " L");
	}
}
