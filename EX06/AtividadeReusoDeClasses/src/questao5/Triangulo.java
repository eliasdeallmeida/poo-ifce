package questao5;

public class Triangulo extends ObjetoGeometrico {
	int lado1;
	int lado2;
	int lado3;
	
	public Triangulo() {
		this(0, 0, 0);
	}
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public void mostrarDados() {
		System.out.println("Lado 1: " + lado1);
		System.out.println("Lado 2: " + lado2);
		System.out.println("Lado 3: " + lado3);
	}
	
	public void calcularPerimetro() {
		System.out.println(lado1 + lado2 + lado3);
	}
	
	public void calcularArea() {
		float meioPerimetro = (lado1 + lado2 + lado3) / 2;
		System.out.println((float) Math.sqrt(meioPerimetro*(meioPerimetro - lado1)*(meioPerimetro - lado2)*(meioPerimetro - lado3)));
	}
}
