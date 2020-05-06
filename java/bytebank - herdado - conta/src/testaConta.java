
public class testaConta {

	public static void main(String[] args) {
		
		ContaCorrente conta2 = new ContaCorrente (4613,002);
		conta2.deposita (100);
		System.out.println("A conta corrente " + conta2.getNumero() + " possui saldo: " + conta2.getSaldo());
		
		ContaPoupanca conta1 = new ContaPoupanca(4613, 001); 
		conta1.deposita(250);
		System.out.println("A conta poupanca " + conta1.getNumero() + " possui saldo: " + conta1.getSaldo());

	}

}
