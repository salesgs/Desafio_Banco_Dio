/*CLASSE GENÉRICA*/
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1; //PROVENDO NA PRÓPRIA CLASSE VALOR CONSTANTE
    private static int SEQUENCIAL =1; //PROVENDO NA PRÓPRIA CLASSE
	
	protected int agencia;
	protected int numero;
	protected double saldo;
    protected TipoConta tipo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente,TipoConta tipo) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.setSaldo(0);
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	public enum TipoConta{
		POUPANCA,
		CORRENTE
	}
	
    @Override
	public void sacar(double valor) {
		this.saldo = this.getSaldo() - valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo = this.getSaldo() + valor;
	}
	@Override
	public void transferir(Conta contaDestino, double valor) {
	    this.sacar(valor); //DESCONTANDO O SALDO DA CONTA
		contaDestino.depositar(valor); //DEPOSITANDO VALOR
	}
	
	public double getSaldo() {return saldo;}
    public void setSaldo(double newSaldo) {this.saldo = newSaldo;}
	
	public int getAgencia() {return agencia;}
    public int getNumero() {return numero;}
	
    
    /*NÃO FAZ SENTIDO DISPONIBLIZAR O  SET PARA ALTERAÇÃO EXTERNA*/

    protected void imprimirInfosComuns() {
    	
    	System.out.println("CLIENTE: " + this.cliente.getNome());
		System.out.println(String.format("AGENCIA %d", getAgencia()));	
		System.out.println("TIPO CONTA: " +this.tipo);
		System.out.println(String.format("NUMERO %d", getNumero()));
		System.out.println(String.format("SALDO %.2f",getSaldo()));
	
    }
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + ", cliente="
				+ cliente + "]";
	}
    
  
}
