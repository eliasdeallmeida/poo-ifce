package questoes;

public class DemonstracaoFerias {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		// Logo abaixo, uma demonstração da chamada de método sem e com parâmetros, respectivamente
		funcionario.tirarFerias();
		funcionario.tirarFerias(365);
	}
}
