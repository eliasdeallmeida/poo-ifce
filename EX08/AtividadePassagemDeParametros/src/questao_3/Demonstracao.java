package questao_3;

public class Demonstracao {
	public static void alterarPreco(Produto p) {
		p.preco = 25f;
	}
	
	public static void main(String[] args) {
		Produto p = new Produto();
		p.nome = "caderno";
		p.preco = 30f;
		// Na linha seguinte, o produto tem suas informações impressas
		System.out.println("O produto " + p.nome + " custa R$ " + p.preco);
		// Depois, a referência do objeto "p" é passada como parâmetro para um método
		alterarPreco(p);
		// Por fim, o preço do produto foi alterado devido a passagem de uma referência que continuará apontando para o mesmo objeto criado anteriormente
		System.out.println("O produto " + p.nome + " custa R$ " + p.preco);
	}
}
