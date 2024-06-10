import java.util.Map;
import java.util.HashMap;

public class Banco {

	 private Map<Integer,Conta> contas;
	 
	 public Banco() {
		 this.contas = new HashMap<>();
	 }
	 
	 
	 public Map<Integer,Conta> getContas(){
		 return contas;
	 }
	 
	 public void adicionarConta(Conta conta) {
		 this.contas.put(conta.getNumero(), conta);
	 }
	 public void listarContas() {
		 System.out.println(this.contas);
	 }
	 
	 
	 
	 
 }
