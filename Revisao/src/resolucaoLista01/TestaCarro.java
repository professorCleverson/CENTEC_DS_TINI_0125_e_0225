package resolucaoLista01;

import java.util.Scanner;

public class TestaCarro {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println("Marca:" + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		
	}
}
