
public interface IConta {
    
	
	/* INTERFACES NÃO POSSUEM CORPO NOS MÉTODOS. O MESMO DEVER SER IMPLEMENTADO POR QUEM */
	/* IMPLEMENTA A INTERFACE */
	/* TOTO MÉTODO DE UMA INTERFACE É PUBLIC POR PADRÃO */
	/* MESMO QUANDO NÃO  EXPLICÍTO O MODIFICAODR "PUBLIC" */
	
	 abstract void sacar(double valor);
	 abstract void depositar(double valor);
	 abstract void transferir( Conta contaDestino, double valor);
	 abstract void imprimirExtrato();
    
}
