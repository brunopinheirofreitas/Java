//Gerente eh um Funcionario, Gerente herda da class Funcionario
/*Nesse sentido:
 * Funcionario se torna uma: Classe Mãe, Base Class, Super Class
 *  Gerente se torna uma: Classe filha
 *  
 */
public class Gerente extends Funcionario{

	public double getBonificacao() { //Reescrita: Redefinição de métodos da classe mãe na classe filha.
		System.out.println("Método do Gerente");
		return 1000;//Outra forma é colocar super.salario, pois o atributo não está definido na classe Gerente, e sim na classe Funcionário.
	}
	
	
}
