package questao_4;

public class Demonstracao {
	public static void dizerOla() {
		dizerOla("Fulano de Tal");
	}
	
	public static void dizerOla(String nome) {
		System.out.println("Olá, " + nome + "! Prazer em te conhecer!");
	}
	public static void main(String[] args) {
		// O método dizer olá pode receber um ou mais parâmetros devido a sobrecarga de métodos
		// Abaixo uma demonstração do método quando não recebe nenhum parâmetro e quando recebe, respectivamente
		dizerOla();
		dizerOla("Luana");
	}
}
