package resolucaoLista01;

public class Produto {
	String nomeProduto;
	double vlPreco = 0;
	
	public double calcDesc(double vlSDesc, double pDesc) {
		double vlCDesc = 0;
		
		vlCDesc = vlSDesc * (pDesc /100);
		
		return vlCDesc;
	}

}
