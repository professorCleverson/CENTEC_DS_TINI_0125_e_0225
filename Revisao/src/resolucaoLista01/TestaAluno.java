package resolucaoLista01;

import java.util.Scanner;

public class TestaAluno {
	public static void main(String[] args) {
		double nota = 0;
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		nota = sc.nextDouble();
		
		System.out.println("Status: " + aluno.calcStatus(nota));
	}

}
