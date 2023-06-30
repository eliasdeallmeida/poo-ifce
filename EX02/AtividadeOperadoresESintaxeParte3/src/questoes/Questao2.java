package questoes;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		System.out.print("Digite um número inteiro: ");
		
		Scanner scanner = new Scanner(System.in);
		String strN = scanner.nextLine();
		scanner.close();
		
		int n = Integer.parseInt(strN);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
