package questoes;

public class Relogio {
	public void inicializar(int hora, int minuto, int segundo) {
		System.out.printf("São %dh, %dmin e %ds\n", hora, minuto, segundo);
	}
	
	public void inicializar(int hora, int minuto) {
		inicializar(hora, minuto, 1);
	}
	
	public void inicializar(int hora) {
		inicializar(hora, 1, 1);
	}
}
