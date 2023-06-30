package questao5;

public class Circulo extends ObjetoGeometrico {
	int centro;
	int raio;
	
	public Circulo() {
		this(0, 0);
	}
	
	public Circulo(int centro, int raio) {
		this.centro = centro;
		this.raio = raio;
	}
	
	public void mostrarDados() {
		System.out.println("Centro: " + centro);
		System.out.println("Raio: " + raio);
	}
	
	public void calcularPerimetro() {
		System.out.println((float) (2 * Math.PI * raio));
	}
	
	public void calcularArea() {
		System.out.println((float) (Math.PI * raio * raio));
	}
}
