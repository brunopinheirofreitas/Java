
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override //Serve para indicar que a classe filha sobrescreveu um metodo da classe mae
	public boolean saca(double valor) {
		return super.saca(valor);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
