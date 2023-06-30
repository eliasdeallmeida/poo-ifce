package model;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class PessoaDAO {
	public void salvar(Pessoa p) {
		try {
	        FileWriter fileWriter = new FileWriter("nomes.txt", true);
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	        bufferedWriter.write(p.getNome() + "\n");
	        bufferedWriter.close();
	        System.out.println("Nome salvo com sucesso!");
	    } catch (Exception e) {
	        System.out.println(">>> Erro: " + e.getMessage());
	    }
	}
}
