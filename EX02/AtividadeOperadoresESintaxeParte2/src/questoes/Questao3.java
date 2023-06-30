package questoes;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {	
		System.out.print("Digite um número inteiro: ");
		
		Scanner scanner = new Scanner(System.in);
		String strX = scanner.nextLine();
		scanner.close();
		
		int x = Integer.parseInt(strX);
		int y = (x % 2 == 0)? x / 2 : 3 * x + 1;
		
		System.out.printf("x = %d e y = %d", x, y);
	}
}
