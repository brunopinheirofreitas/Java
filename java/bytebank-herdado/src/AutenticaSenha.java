//

public class AutenticaSenha {

	private int senha;

public void setSenha(int senha, Funcionario f2) {
	if (f2.getTipo() == 1) {
	this.senha = senha;
} else {
	System.out.println("Esse tipo de funcion�rio n�o possui senha.");
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
		System.out.println("Usu�rio n�o possui senha.");
		return false;
	}
}

}
