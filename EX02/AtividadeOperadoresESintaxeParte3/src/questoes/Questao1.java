package questoes;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		System.out.print("Digite um número inteiro: ");
		
		Scanner scanner = new Scanner(System.in);
		String strX = scanner.nextLine();
		scanner.close();
		
		int x = Integer.parseInt(strX);
		
		int y = 0;
		while (y != 1) {
			x = y = (x % 2 == 0)? x / 2 : 3 * x + 1;
			System.out.printf("y = %d\n", y);
		}
	}
}
