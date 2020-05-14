
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente ();
		g.setSenha(123);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm); //Apenas gerente pode autenticar na classe SistemaInterno. Se eu levo o método de setSenha e autentica de GERENTE para FUNCIONARIO, todo FUNCIONARIO poderá autenticar. Portanto, INTERFACE é criar uma classe intermediaria entre a classe PAI e as classes FILHOS.
		
	}

}
