package sistemahospitalar;

public class Medico extends Pessoa {
	private String crm;
	private float salario;
	private String especializacao;
	private boolean darPlantao;
	
	public Medico() {
		this.crm = "00000000-0";
		this.especializacao = "vazio";
	}
	
	public String getCrm() {
		return this.crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getEspecializacao() {
		return this.especializacao;
	}
	
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public boolean getDarPlantao() {
		return this.darPlantao;
	}
	
	public void setDarPlantao(boolean darPlantao) {
		this.darPlantao = darPlantao;
	}
	
	public void imprimirValores() {
		System.out.println("DADOS DE MÉDICO");
		System.out.println("CRM: " + getCrm());
		System.out.println("Salário: R$ " + getSalario());
		System.out.println("Especialização: " + (getEspecializacao()));
		System.out.println("Médico dá plantão: " + (getDarPlantao() == true? "sim" : "não"));
		System.out.println();
	}
}
