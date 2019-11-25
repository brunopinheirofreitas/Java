//Gerente eh um Funcionario, Gerente herda da class Funcionario
/*Nesse sentido:
 * Funcionario se torna uma: Classe Mãe, Base Class, Super Class
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
	
	public double getBonificacao() { //Reescrita: Redefinição de métodos da classe mãe na classe filha.
		System.out.println("Método do Gerente");
		return (super.getBonificacao()) + super.getSalario();//Outra forma é colocar super.salario, pois o atributo não está definido na classe Gerente, e sim na classe Funcionário.
	}
	
	
}
