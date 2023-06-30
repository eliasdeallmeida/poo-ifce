package questoes;

public class Questao2ItemC {
	public static int variavelDeClasse = 10;
	public int variavelDeObjeto = 5;
	
	public static void main(String[] args) {
		Questao2ItemC instancia1 = new Questao2ItemC();
		Questao2ItemC instancia2 = new Questao2ItemC();
		
		instancia1.variavelDeClasse += 1;
		instancia1.variavelDeObjeto += 1;
		
		instancia2.variavelDeClasse += 1;
		instancia2.variavelDeObjeto += 1;
		
		// A partir das saídas de dados logo abaixo, é possível perceber que a variavelDeClasse é criada uma única vez e é comum para todos os objetos instanciados. Portatnto, a cada soma dessa variável, todos os objetos terão seu valor alterado simultaneamente. Por outro lado, a variavelDeObjeto é criada toda vez que o objeto é instanciado. Sendo assim, todo objeto possuirá sua própria variável independente.
		
		System.out.println(instancia1.variavelDeClasse);
		System.out.println(instancia1.variavelDeObjeto);
		
		System.out.println(instancia2.variavelDeClasse);
		System.out.println(instancia2.variavelDeObjeto);
	}
}
