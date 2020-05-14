
public class SistemaInterno {
	
	private int senha = 2222;
	public void autentica(Autentica fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso concedido");
		} else {
			System.out.println("Acesso não autorizado");
		}
	}

}
