package sistemahospitalar;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	private String endereco;
	
	public Pessoa() {
		this.nome = "vazio";
		this.sexo = 'x';
		this.cpf = "000.000.000-00";
		this.endereco = "vazio";
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void andar() {
		System.out.println("(Pessoa está andando...)");
	}
	
	public void imprimirValores() {
		System.out.println("DADOS DE PESSOA");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("CPF: " + getCpf());
		System.out.println("Endereço: " + getEndereco());
		System.out.println();
	}
}
