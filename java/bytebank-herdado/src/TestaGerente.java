
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Gerente g1 = new Gerente();
	g1.setNome("Marco");
	g1.setCpf("12345698787");
	g1.setSalario(5000.0);
	
	System.out.println("Dados do gerente: " + g1.getNome() + " " + g1.getCpf() + " " + g1.getSalario());
	
	g1.setSenha(666);
	System.out.println(g1.autentica(555));
	
	boolean autenticou = g1.autentica(666);
	
	System.out.println(autenticou);
	
	System.out.println(g1.getBonificacao());

	}

}
