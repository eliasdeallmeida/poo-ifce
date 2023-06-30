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
	Scanner scanner = new Scanner(System.in);
	
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
		while (valor < 1100) {
			System.out.print("ERRO >>> Informe um salário maior ou igual a R$ 1100,00: ");
			String strScanner = scanner.nextLine();
			valor = Double.parseDouble(strScanner);
		}
		this.salario = valor;
	}
	
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public void setDataAdmissao(String strData) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse(strData);
 		Date dataAtual = new Date();
		while (data.after(dataAtual)) {
			System.out.println("ERRO >>> A data não pode estar no futuro");
			System.out.print("Informe uma data válida (dd/mm/aaaa): ");
			strData = scanner.nextLine();
			data = sdf.parse(strData);
		}
		this.dataAdmissao = data;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public void tirarFerias() {
		tirarFerias(30);
	}
	
	public void tirarFerias(int dias) {
		System.out.printf("Você irá tirar %d dias de férias\n", dias);
	}
}
