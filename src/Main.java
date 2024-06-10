
public class Main {

	public static void main(String[] args) {

		Cliente gabriel = new Cliente("GABRIEL" ,"90897654");
		
		Conta  cc = new ContaCorrente(gabriel,Conta.TipoConta.CORRENTE);
		Conta  cp = new ContaPoupanca(gabriel,Conta.TipoConta.POUPANCA);
        
		
		cc.depositar(100);
		cc.transferir(cp, 50);
	    
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Banco nubank = new Banco();
		nubank.adicionarConta(cc);
		nubank.listarContas();
		
	    
	}

}
