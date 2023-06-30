package questao5;

public class Retangulo extends ObjetoGeometrico{
	int base;
	int altura;
	
	public Retangulo() {
		this(0, 0);
	}
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void mostrarDados() {
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
	}
	
	public void calcularPerimetro() {
		System.out.println(2 * base + 2 * altura);
	}
	
	public void calcularArea() {
		System.out.println(base * altura);
	}
}
