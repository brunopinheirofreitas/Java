//Java n�o tem heran�a m�ltipla.
//Uma interface � um tipo que possui todos os seus m�todos abstrados. N�o possui atributos.
//Quem utiliza a interface precisa implementar os m�todos.
//Composi��o: Reutiliza��o de c�digos atrav�s de interfaces.

public abstract interface Autentica {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
