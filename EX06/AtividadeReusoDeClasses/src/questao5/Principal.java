package questao5;

public class Principal {
	public static void main(String[] args) {
		Retangulo r = new Retangulo(2, 10);		
		r.mostrarDados();
		r.calcularPerimetro();
		r.calcularArea();
		System.out.println();
		
		Triangulo t = new Triangulo(3, 4, 5);
		t.mostrarDados();
		t.calcularPerimetro();
		t.calcularArea();
		System.out.println();
		
		Circulo c = new Circulo(0, 5);
		c.mostrarDados();
		c.calcularPerimetro();
		c.calcularArea();
		System.out.println();
	}
}
