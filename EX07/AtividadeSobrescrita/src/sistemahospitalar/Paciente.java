package sistemahospitalar;

public class Paciente extends Pessoa {
	private String doenca;
	private String medicacao;
	private boolean senteDor;
	private boolean temAlta;
	
	public Paciente() {
		this.doenca = "vazio";
		this.medicacao = "vazio";
		
	}
	
	public String getDoenca() {
		return this.doenca;
	}
	
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	public String getMedicacao() {
		return this.medicacao;
	}
	
	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
	public boolean getSenteDor() {
		return this.senteDor;
	}
	
	public void setSenteDor(boolean senteDor) {
		this.senteDor = senteDor;
	}
	
	public boolean getTemAlta() {
		return this.temAlta;
	}
	
	public void setTemAlta(boolean temAlta) {
		this.temAlta = temAlta;
	}
	
	public void imprimirValores() {
		System.out.println("DADOS DE PACIENTE");
		System.out.println("Doença: " + getDoenca());
		System.out.println("Medicação: " + getMedicacao());
		System.out.println("Paciente sente dor: " + (getSenteDor() == true? "sim" : "não"));
		System.out.println("Paciente tem alta: " + (getTemAlta() == true? "sim" : "não"));
		System.out.println();
	}
}
