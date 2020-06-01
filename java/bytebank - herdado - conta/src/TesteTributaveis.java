
public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0123, 52520);
		cc.deposita(1000.0);
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
