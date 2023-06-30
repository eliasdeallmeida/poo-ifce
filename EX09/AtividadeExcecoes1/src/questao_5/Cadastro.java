package questao_5;

import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		String nomeCompleto = null;
		String telefone = null;
		boolean cadastroFeito = false;
		Scanner scanner = new Scanner(System.in);
		
		while(cadastroFeito == false) {
			System.out.print("Informe seu nome: ");
			nomeCompleto = scanner.nextLine();
			try {
				if(nomeCompleto.isEmpty()) {
					throw new Exception("O nome não pode ser vazio.");
				}
			} catch(Exception excecao) {
				System.out.println("Exceção capturada: " + excecao.getMessage());
				continue;
			}
			
			System.out.println("Informe seu telefone");
			System.out.print("DDD: ");
			String ddd = scanner.nextLine();
			try {
				Integer.parseInt(ddd);
				if(ddd.length() != 2) {
					throw new Exception("O DDD deve ter dois dígitos.");
				}
			} catch(NumberFormatException excecao) {
				System.out.println("O DDD deve ser numérico.");
				continue;
			}
			catch(Exception excecao) {
				System.out.println(excecao.getMessage());
				continue;
			} finally {
				telefone = "(" + ddd + ")";				
			}
			
			System.out.print("Número: ");
			String numero = scanner.nextLine();
			try {
				Integer.parseInt(numero);
				if(numero.length() < 8 || numero.length() > 9) {
					throw new Exception("O número deve ter 8 ou 9 dígitos.");
				}
			} catch(NumberFormatException excecao) {
				System.out.println("O número deve ser válido");
				continue;
			} catch(Exception excecao) {
				System.out.println(excecao.getMessage());
				continue;
			} finally {				
				telefone += " " + numero;
			}
			
			cadastroFeito = true;
		}
		
		scanner.close();
		
		System.out.println();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Telefone: " + telefone);
	}
}
