package questao_3;

public class Execucao {
	public static void main(String[] args) {
		try {
			Data data = new Data(23, 4, 2023);
		} catch(DataException excecao) {
			System.out.println("Houve um problema com a data " + excecao.dataInvalida + ": " + excecao.getMessage());
		}
		
		try {
			Data data = new Data(30, 2, 2025);
		} catch(DataException excecao) {
			System.out.println("Houve um problema com a data " + excecao.dataInvalida + ": " + excecao.getMessage());
		}
		
		try {
			Data data = new Data(16, 13, 2015);
		} catch(DataException excecao) {
			System.out.println("Houve um problema com a data " + excecao.dataInvalida + ": " + excecao.getMessage());
		}
		
		System.out.println("Fim do programa.");
	}
}
