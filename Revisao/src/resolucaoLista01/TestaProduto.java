package resolucaoLista01;

import java.util.Scanner;

public class TestaProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		double vlSDesc = 0, pDesc = 0, vlDesc=0, vFinal=0;
		
		System.out.println("Preço: ");
		vlSDesc = sc.nextDouble();
		System.out.println("% Desc.: ");
		pDesc = sc.nextDouble();
		
		vlDesc = prod.calcDesc(vlSDesc, pDesc);
		vFinal = vlSDesc - vlDesc;
		
		System.out.println("Valor do Desc.: " + vlDesc);
 		System.out.println("Valor Final " + vFinal);
		
		
	}

}
