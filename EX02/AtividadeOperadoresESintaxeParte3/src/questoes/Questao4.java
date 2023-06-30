package questoes;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		System.out.print("Digite um número inteiro: ");
		
		Scanner scanner = new Scanner(System.in);
		String strMax = scanner.nextLine();
		scanner.close();
		
		int max = Integer.parseInt(strMax);
		int n1 = 0, n2 = 1, n3;
		
		System.out.printf("Sequência de Fibonacci até %d: %d %d ", max, n1, n2);
		
		while (n1 + n2 <= max) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.printf("%d ", n3);
		}
	}
}
