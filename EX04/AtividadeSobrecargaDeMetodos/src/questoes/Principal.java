package questoes;

import java.text.ParseException;

public class Principal {
	public static void main(String[] args) throws ParseException  {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.setNome("João");
		f1.setSalario(2300.85);
		f1.setDataAdmissao("08/02/2020");
		
		f2.setNome("Maria");
		f2.setSalario(5350.25);
		f2.setDataAdmissao("20/02/2014");
		
		f3.setNome("Fábio");
		f3.setSalario(3000);
		f3.setDataAdmissao("11/11/2011");
		
		System.out.println("Funcionário 1");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salário: " + f1.getSalario());
		System.out.println("Data de admissão: " + f1.getDataAdmissao() + "\n");
		
		System.out.println("Funcionário 2");
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Salário: " + f2.getSalario());
		System.out.println("Data de admissão " + f2.getDataAdmissao() + "\n");
		
		System.out.println("Funcionário 3");
		System.out.println("Nome: " + f3.getNome());
		System.out.println("Salário: " + f3.getSalario());
		System.out.println("Data de admissão: " + f3.getDataAdmissao() + "\n");
	}
}
