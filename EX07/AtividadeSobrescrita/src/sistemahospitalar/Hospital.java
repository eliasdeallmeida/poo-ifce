package sistemahospitalar;

public class Hospital {
	private String nome;
	private String endereco;
	
	public Hospital() {
		this.nome = "vazio";
		this.endereco = "vazio";
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprimirValores() {
		System.out.println("DADOS DE HOSPITAL");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
	}
}
