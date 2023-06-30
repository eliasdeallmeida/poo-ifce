package principal;

import java.util.ArrayList;
import java.util.List;

import entidade.EstacaoFerroviaria;
import entidade.LinhaFerroviaria;
import entidade.Locomotiva;
import entidade.RecursoFerroviario;
import entidade.Trem;
import entidade.Vagao;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Início do programa.");

		List<LinhaFerroviaria> linhasEstacao1 = new ArrayList<LinhaFerroviaria>();
		List<LinhaFerroviaria> linhasEstacao2 = new ArrayList<LinhaFerroviaria>();
		List<RecursoFerroviario> recursosEstacao1 = new ArrayList<RecursoFerroviario>();
		List<RecursoFerroviario> recursosTrem1 = new ArrayList<RecursoFerroviario>();

		linhasEstacao1.add(new LinhaFerroviaria(1, 10, "Linha 1"));
		linhasEstacao1.add(new LinhaFerroviaria(2, 20, "Linha 2"));
		
		linhasEstacao2.add(new LinhaFerroviaria(3, 30, "Linha 3"));
		linhasEstacao2.add(new LinhaFerroviaria(4, 40, "Linha 4"));
		
		EstacaoFerroviaria estacao1 = new EstacaoFerroviaria("E1", "Estacao 1", linhasEstacao1);
		EstacaoFerroviaria estacao2 = new EstacaoFerroviaria("E2", "Estacao 2", linhasEstacao2);
		
		recursosTrem1.add(new Locomotiva("LC1", 10.5, 20.5));
		recursosTrem1.add(new Vagao("VG1", "Tipo 1", 10, 20, 30));
		recursosTrem1.add(new Vagao("VG2", "Tipo 2", 30, 20, 10));

		try {
			Trem trem1 = new Trem("T01", "20/06/2023", estacao1, estacao2, recursosTrem1);
			recursosEstacao1.add(trem1);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println("Fim do programa.");
	}
}
