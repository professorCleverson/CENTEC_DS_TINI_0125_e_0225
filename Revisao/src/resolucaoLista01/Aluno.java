package resolucaoLista01;

public class Aluno {
	String nome;
	double nota = 6;
	
	public String calcStatus(double nota) {
		
		if(nota >= 7) {
			return "Aprovado!";
		}else {
			return "Reprovado!";
		}
	}
}
