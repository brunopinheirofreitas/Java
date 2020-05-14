//Java não tem herança múltipla.
//Uma interface é um tipo que possui todos os seus métodos abstrados.
//Quem utiliza a interface precisa implementar os métodos.

public abstract interface Autentica {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
