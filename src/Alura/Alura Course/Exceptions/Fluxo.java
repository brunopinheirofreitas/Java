
public class Fluxo extends Conta {
	
	public Fluxo(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();		
		} catch(ArithmeticException | NullPointerException | MyException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		throw new MyException("Deu mais ou menos errado");
		//System.out.println("Fim do metodo2");
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}

}
