//Gerente eh um Funcionario, Gerente herda da class Funcionario
/*Nesse sentido:
 * Funcionario se torna uma: Classe M�e, Base Class, Super Class
 *  Gerente se torna uma: Classe filha
 *  
 */
public class Gerente extends Funcionario implements Autentica {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}


	public double getBonificacao() { //Reescrita: Redefini��o de m�todos da classe m�e na classe filha.
		System.out.println("M�todo do Gerente");
		return 1000;//Outra forma � colocar super.salario, pois o atributo n�o est� definido na classe Gerente, e sim na classe Funcion�rio.
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
}
