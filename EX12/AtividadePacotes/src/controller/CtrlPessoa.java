package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {
	public void salvar(Pessoa p) throws Exception {
		if(p.getNome().isEmpty() || p.getNome().isBlank()) {
			throw new Exception("O nome fornecido não pode ser nulo ou vazio.");
		} else {
			PessoaDAO pdao = new PessoaDAO();
			pdao.salvar(p);
		}
	}
}
