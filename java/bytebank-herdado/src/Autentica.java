//Java não tem herança múltipla.
//Uma interface é um tipo que possui todos os seus métodos abstrados. Não possui atributos.
//Quem utiliza a interface precisa implementar os métodos.
//Composição: Reutilização de códigos através de interfaces.

public abstract interface Autentica {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
