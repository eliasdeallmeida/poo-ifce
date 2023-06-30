package questoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Funcionario {
	private String nome;
	private double salario;
	private Date dataAdmissao;
	private int identificador;
	
	private static int contador = 1;
	
	public Funcionario() {
		identificador = contador++;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String texto) {
		this.nome = texto;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double valor) {
		Scanner scanner = new Scanner(System.in);

		while (valor < 1100) {
			System.out.print("ERRO >>> Informe um salário maior ou igual a R$ 1100,00: ");
			String strScanner = scanner.nextLine();
			valor = Double.parseDouble(strScanner);
		}

		scanner.close();
		this.salario = valor;
	}
	
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public void setDataAdmissao(String strData) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse(strData);
 		Date dataAtual = new Date();
		Scanner scanner = new Scanner(System.in);

		while (data.after(dataAtual)) {
			System.out.println("ERRO >>> A data não pode estar no futuro");
			System.out.print("Informe uma data válida (dd/mm/aaaa): ");
			strData = scanner.nextLine();
			data = sdf.parse(strData);
		}

		scanner.close();
		this.dataAdmissao = data;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
}
