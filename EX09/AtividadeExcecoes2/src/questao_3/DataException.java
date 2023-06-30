package questao_3;

public class DataException extends Exception {
	public String dataInvalida;
	
	public DataException(String dataInvalida, String mensagem) {
		super(mensagem);
		this.dataInvalida = dataInvalida;
	}
}
