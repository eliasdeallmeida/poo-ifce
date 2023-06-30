package sistemahospitalar;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		Medico medico = new Medico();
		Hospital hospital = new Hospital();
		
		pessoa.imprimirValores();
		paciente.imprimirValores();
		medico.imprimirValores();
		hospital.imprimirValores();
		
		scanner.close();
	}
}
