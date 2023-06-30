package questao_4;

import java.util.Scanner;

public class Demonstracao {
	public static int lerNumeroInteiro() throws NumberFormatException {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		try {
			num = Integer.parseInt(scanner.nextLine());
			scanner.close();
		} catch(NumberFormatException e) {
			System.out.println("Exceção 1 capturada!");
			e.printStackTrace();
			scanner.close();
			throw new NumberFormatException("O valor informado não é inteiro!");
		} catch(Exception e) {
			System.out.println("Exceção 2 capturada!");
			e.printStackTrace();
			scanner.close();
			throw e;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int num = lerNumeroInteiro();
		System.out.println("Número = " + num);
		System.out.println("Fim do programa.");
	}
}
