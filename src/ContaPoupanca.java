public class ContaPoupanca  extends Conta{

	
	
	public ContaPoupanca(Cliente cliente,Conta.TipoConta tipo) {
		super(cliente, tipo);
		// TODO Auto-generated constructor stub
	}

		//POLIMORFISMO DE SOBREPOSIÇÃO
		@Override
		public void imprimirExtrato() {
			System.out.println("=== EXTRATO CONTA CORRENTE ===");
		     super.imprimirInfosComuns();
		}

}
