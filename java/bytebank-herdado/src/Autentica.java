//Java n�o tem heran�a m�ltipla.
//Uma interface � um tipo que possui todos os seus m�todos abstrados.
//Quem utiliza a interface precisa implementar os m�todos.

public abstract interface Autentica {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
