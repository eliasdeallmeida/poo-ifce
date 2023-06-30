package questao4;

/**
 * Classe correspondente ao objeto smartphone com seus respectivos atributos, construtores e métodos
 * 
 * @author Elias de Almeida Sombra Neto
 */

public class Smartphone {
	private double armazenamento;
	
	/**
	 * Construtor que deve obrigatoriamente receber uma quantidade de armazenamento do smartphone
	 * @param armazenamento
	 */
	public Smartphone(double armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	/**
	 * Método que informa que o smartphone foi ligado
	 */
	public void ligar() {
		System.out.println("O smartphone foi ligado.");
	}
}
