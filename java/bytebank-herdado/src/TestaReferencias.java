
public class TestaReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente(); //Criando um novo objeto Funcionario com instanciamento da classe gerente.
		g1.setNome("Marcos");			//Esse objeto possui duas refer�ncias, uma na classe Funcionario e outra na classe Gerente.
		g1.setTipo(1);
		//String nome = g1.getNome();
		//System.out.println(nome);
		g1.setSalario(5000.0);
		//System.out.println(g1.getTipo());
		g1.setTipo(1);
		
		Funcionario f1 = new Gerente();
		f1.setNome("Jose");
		f1.setSalario(2000.0);
		f1.setTipo(0);
		
		Funcionario e1 = new EditorVideo();
		e1.setNome("Joaquim");
		e1.setTipo(3);
		e1.setSalario(2500.0);
		e1.setTipo(2);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println("Custo total de bonifica��es: " + controle.getSoma());
		System.out.println("Valor da bonifica��es do funcion�rio: " + f1.getBonificacao());
		System.out.println("Valor da bonifica��es do Gerente: " + g1.getBonificacao());
		System.out.println("Valor da bonifica��es do Editor de Video: " + e1.getBonificacao());
		
		AutenticaSenha autenticaSenhaUsuario = new AutenticaSenha();
		autenticaSenhaUsuario.setSenha(5555, f1);
		System.out.println(autenticaSenhaUsuario.autentica(5555, f1));
		
		

		
		
	}

}
