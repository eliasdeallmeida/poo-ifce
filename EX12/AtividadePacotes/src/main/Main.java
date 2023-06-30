package main;

import view.CadPessoa;

public class Main {
	public static void main(String[] args) {
		try {
			CadPessoa cadp = new CadPessoa();
		} catch(Exception e) {
			System.out.println(">>> Erro: " + e.getMessage());
		} finally {
			System.out.println("Fim do programa");
		}
	}
}
