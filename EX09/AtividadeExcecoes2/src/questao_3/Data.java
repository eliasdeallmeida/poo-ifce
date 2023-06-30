package questao_3;

public class Data {
	public String dataInformada;
	
	public Data(int dia, int mes, int ano) throws DataException {
		this.dataInformada = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
		
		if(mes < 1 || mes > 12) {
			throw new DataException(dataInformada, "O número do mês deve estar entre 1 e 12.");
		} else if(dia < 1) {
			throw new DataException(dataInformada, "O número do dia não pode ser menor que 1.");
		} else if(mes == 2 && dia > 28) {
			throw new DataException(dataInformada, "O mês " + mes + " só tem até 28 dias.");
		} else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			throw new DataException(dataInformada, "O mês " + mes + " só tem até 30 dias.");
		} else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
			throw new DataException(dataInformada, "O mês " + mes + " só tem até 30 dias.");
		} else {
			System.out.println("A data " + dataInformada + " foi preenchida com sucesso!");
		}
	}
}
