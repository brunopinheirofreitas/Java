//Gerente eh um Funcionario, Gerente herda da class Funcionario
/*Nesse sentido:
 * Funcionario se torna uma: Classe M�e, Base Class, Super Class
 *  Gerente se torna uma: Classe filha
 *  
 */
public class Gerente extends Funcionario{

	private int senha;
	
	public int getSenha() {
		return senha;
	}



	public void setSenha(int senha) {
		this.senha = senha;
	}



	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() { //Reescrita: Redefini��o de m�todos da classe m�e na classe filha.
		System.out.println("M�todo do Gerente");
		return 1000;//Outra forma � colocar super.salario, pois o atributo n�o est� definido na classe Gerente, e sim na classe Funcion�rio.
	}
	
	
}
