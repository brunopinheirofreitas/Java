
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override //Serve para indicar que a classe filha sobrescreveu um metodo da classe mae
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return super.saca(valor);
	}

}
