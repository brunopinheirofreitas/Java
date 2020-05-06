
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Maclouden");
		nico.setCpf("12345678910");
		nico.setSalario(3200.00);
				
		System.out.println(nico.getBonificacao());
		

	}

}
