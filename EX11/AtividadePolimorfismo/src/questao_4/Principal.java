package questao_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String opcao;
		
		while(true) {
			mostrarMenu();
			
			System.out.print(">>> Sua escolha: ");
			opcao = scanner.nextLine();
			
			switch(opcao) {
				case "1":
					cadastrarProduto();
					break;
				case "2":
				case "5":
					listarProdutos();
					break;
				case "3":
					cadastrarLivro();
					break;
				case "4":
					listarLivros();
					break;
				default:
					System.out.println("\nOpção inválida!");
					aguardar(3);
			}
		}
	}
	
	public static void mostrarMenu() {
		System.out.println(
			"\nMENU PRINCIPAL\n"
			+ "1. Cadastrar produto\n"
			+ "2. Listar produtos\n"
			+ "3. Cadastrar livro\n"
			+ "4. Listar livros\n"
			+ "5. Imprimir tudo\n"
			+ "6. Sair"
		);
	}
	
	public static void cadastrarProduto() {
		System.out.println("\nCADASTRAR PRODUTO");
		produtos.add(capturarInformacoesProduto());
	}
	
	public static Produto capturarInformacoesProduto() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Descrição: ");
		String descricao = scanner.nextLine();
		System.out.print("Preço: ");
		double preco = Double.parseDouble(scanner.nextLine());
		return new Produto(nome, descricao, preco);
	}
	
	public static void listarProdutos() {
		System.out.println("\nLISTA DE PRODUTOS");
		for(Produto produto: produtos) {
			System.out.println(produto.toString());
		}
		aguardar(3);
	}
	
	public static void cadastrarLivro() {
		System.out.println("\nCADASTRAR LIVRO");
		produtos.add(capturarInformacoesLivro());
	}
	
	public static Livro capturarInformacoesLivro() {
		Produto produto = capturarInformacoesProduto();
		System.out.print("Autores: ");
		String autores = scanner.nextLine();
		System.out.print("ISBN: ");
		String isbn = scanner.nextLine();
		System.out.print("Editora: ");
		String editora = scanner.nextLine();
		return new Livro(produto.getNome(), produto.getDescricao(), produto.getPreco(), autores, isbn, editora);
	}
	
	public static void listarLivros() {
		System.out.println("\nLISTA DE LIVROS");
		for(Produto produto : produtos) {
			if(produto instanceof Livro) {
				Livro livro = (Livro) produto;
				System.out.println(livro.toString());
			}
		}
		aguardar(3);
	}
	
	public static void aguardar(int segundos) {
		System.out.print("\nAguarde");
		for(int i = 0; i < segundos; i++) {
			try {
				Thread.sleep(500);
				System.out.print(".");
			} catch(Exception excecao) {
				excecao.printStackTrace();
			}
		}
		System.out.println();
	}
}
