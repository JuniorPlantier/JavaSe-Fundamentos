
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(45687);
		c.setAtiva(true);
		
		c.depositar(1000);
		c.sacar(200);
		
		double saldo = c.getSaldo();
		
		
	}
}
