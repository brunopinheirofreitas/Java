package bytebank;
public class Conta implements java.io.Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas sao " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) { //passing a generic type
		Conta c = (Conta) ref; //casting ref as a conta, transforming a specific type into a generic type.
		if (this.agencia != c.agencia) {
			return false;
		}
		if (this.numero != c.numero) {
			return false;
		}
		return true;
	}
	
	public boolean ehIgual (Conta c) {
		if (this.agencia != c.agencia) {
			return false;
		}
		if (this.numero != c.numero) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Agencia: "+agencia + " " + "Numero: " + numero;
	}

}