package view;

import java.util.Scanner;

import controller.CtrlPessoa;
import model.Pessoa;

public class CadPessoa {
	
	public CadPessoa() throws Exception {
		Scanner scanner = new Scanner(System.in);
		Pessoa p = new Pessoa();
		CtrlPessoa cp = new CtrlPessoa();
		System.out.print("Informe seu nome: ");
		p.setNome(scanner.nextLine());
		cp.salvar(p);
		scanner.close();
	}
}
