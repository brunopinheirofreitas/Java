//

public class AutenticaSenha {

	private int senha;

public void setSenha(int senha, Funcionario f2) {
	if (f2.getTipo() == 1) {
	this.senha = senha;
} else {
	System.out.println("Esse tipo de funcionário não possui senha.");
}
}


public boolean autentica(int senha, Funcionario f3) {
	if (f3.getTipo() == 1) {
				if (this.senha == senha) {
					return true;
				} else {
					return false;
				}
	}  else {
		System.out.println("Usuário não possui senha.");
		return false;
	}
}

}
