//Extends é para herdar de classes. Para utilizar interfaces tem que usar implements.

public class Cliente implements Autentica{

	private int senha;

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}



}
