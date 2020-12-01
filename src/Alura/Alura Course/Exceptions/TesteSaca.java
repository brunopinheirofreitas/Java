
public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(4613, 666);
		
		conta.deposita(200.0);
		try {
			conta.saca(300);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Funds: " + conta.getSaldo());
	}

}
