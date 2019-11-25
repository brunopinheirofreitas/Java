public class TestaBanco {
	public static void main(String[] args) {

		/*
		 * Cliente paulo = new Cliente(); //Cliente é um objeto da classe Cliente.java//
		 * paulo.setNome("Paulo Silveira"); paulo.setCpf("222.222.222-22");
		 * paulo.setProfissao("programador");
		 * 
		 * Conta contaDoPaulo = new Conta(); contaDoPaulo.deposita(100);
		 * 
		 * contaDoPaulo.setTitular(paulo);
		 * System.out.println(contaDoPaulo.getTitular().getNome());
		 * System.out.println(contaDoPaulo.getTitular());
		 */
		
		/*Cliente cliente = new Cliente();
		*cliente.setNome("Paulo Henrique Amorin");
		*cliente.setCpf("123.456.789-11");
		*cliente.setProfissao("Engenheiro");
		*Conta contaCliente = new Conta();
		*/
		Conta contaCliente2 = new Conta(0012, 20045); 
		Conta contaCliente3 = new Conta(0012, 20046); 
		System.out.println(Conta.getTotal());
		/*contaCliente.setAgencia(4613);
		*contaCliente.setNumero(156);
		*contaCliente.setTitular(cliente);
		*System.out.println(contaCliente.getTitular().getProfissao());
		*contaCliente.getTitular().setProfissao("Cafetão");
		*System.out.println(contaCliente.getTitular().getProfissao());
		*contaCliente.deposita(100);
		*System.out.println(contaCliente.getSaldo());
		*System.out.println(contaCliente.saca(10));
		*System.out.println(contaCliente.getSaldo());
		*/

	}
}