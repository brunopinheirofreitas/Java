// The Administrator Class inherits from Funcionario and signs Autentica
public class Administrador extends Funcionario implements Autentica {

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 5000;
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
