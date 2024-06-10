public class ContaCorrente extends Conta {

	
	
	public ContaCorrente(Cliente cliente,Conta.TipoConta tipo) {
		super(cliente,tipo);
		// TODO Auto-generated constructor stub
	}

	//POLIMORFISMO DE SOBREPOSIÇÃO
	@Override
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		 super.imprimirInfosComuns();
	}
	
	
	
	
}
