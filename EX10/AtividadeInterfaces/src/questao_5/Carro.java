package questao_5;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
	private int numeroCilindrada;
	
	public int getNumeroCilindrada() {
		return numeroCilindrada;
	}
	
	public void setNumeroCilindrada(int numeroCilindrada) {
		this.numeroCilindrada = numeroCilindrada;
	}
	
	public boolean estaParado() {
		return true;
	}
	
	public void curvar(float angulo) {}

	public void embraiar() {}
	
	public void ligarMotor() {}
	
	public void abastecer(int numLitros) {}
}
