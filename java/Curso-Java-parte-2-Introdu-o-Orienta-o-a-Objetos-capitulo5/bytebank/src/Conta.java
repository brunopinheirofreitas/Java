public class Conta {

	private double saldo; //atributos de uma classe//
	private int agencia; //O atributo � encapsulado como PRIVATE pois assim quando do instanciamento de uma classe s� � poss�vel alterar seus objetos via m�todo//
	private int numero;
	private Cliente titular;
	private static int total; //criando um atributo que contar� a quantidade de vezes que a classe conta foi instanciada. O Static serve para isso, funciona como se fosse uma vari�vel global//
	
	//Os m�todos s�o as interfaces de um objeto//

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando o objeto Conta com agencia: "+this.agencia+" e numero de conta: "+this.numero);
		System.out.println("Quantidade de contas na base: "+Conta.total);
	}
	
	public Conta () {
		
	}
	
	
	public void deposita(double valor) { //metodo para depositar//
		if (valor <= 0) {
			System.out.println("Saldo n�o pode ser um numero negativo!");
			return;
		}
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) { //metodo para sacar, verifica se o valor sacado � < que o saldo//
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) { //m�todo que transfere valores de uma conta para outra//
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
//Normalmente se cria um GET para "buscar" informa��es em uma classe e um m�todo SET para incluir dados em um atributo de um objeto//
	public double getSaldo() { //m�todo que informa o saldo de uma conta//
		return this.saldo;
	}

	public int getNumero() { //m�todo que informa o n�mero de uma conta//
		return this.numero;
	}

	public void setNumero(int numero) { //m�todo que recebe o n�mero de uma conta//
		this.numero = numero;
	}

	public int getAgencia() { //m�todo que informa o n�mero da ag�ncia de uma conta//
		return this.agencia;
	}

	public void setAgencia(int agencia) { //m�todo que recebe o n�mero da ag�ncia de uma conta//
		if (agencia <= 0) {
			System.out.println("Agencia n�o pode ser um numero negativo!");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) { //m�todo que recebe o nome do cliente titular da conta//
		this.titular = titular;
	}

	public Cliente getTitular() { //m�todo que informa o nome do cliente titular da conta//
		return this.titular;
	}
	
	public static int getTotal() { //A informa��o STATIC serve para definir que o m�todo � da classe//
		return Conta.total;
	}

}