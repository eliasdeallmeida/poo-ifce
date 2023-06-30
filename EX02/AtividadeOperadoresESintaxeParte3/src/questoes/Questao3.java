package questoes;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		System.out.print("Digite um número inteiro: ");
		
		String strNum, strAux;
		Scanner scanner = new Scanner(System.in);
		strNum = strAux = scanner.nextLine();
		scanner.close();
		
		int num = Integer.parseInt(strNum);
		int aux = Integer.parseInt(strAux);
		int fatorial = 1;
		
		while (aux > 1) {
			fatorial *= aux;
			aux--;
		}
		
		System.out.printf("%d! = %d", num, fatorial);
	}
}
