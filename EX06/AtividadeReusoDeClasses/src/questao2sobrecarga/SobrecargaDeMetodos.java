package questao2sobrecarga;

public class SobrecargaDeMetodos {
	public String nome;
	
	public static void imprimir() {
		imprimir("FULANO");
	}
	
	public static void imprimir(String nome) {
		System.out.println("Seu nome é " + nome);
	}
	
	public static void main(String[] args) {
		imprimir(); //exemplo de método SEM parâmetro
		imprimir("Elias"); //exemplo de método COM parâmetro
	}
}
