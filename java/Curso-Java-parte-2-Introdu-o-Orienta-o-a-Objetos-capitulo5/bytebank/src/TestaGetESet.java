
public class TestaGetESet {
	
	public static void main(String[] args) {
		//testa classe conta com encapsulamento//
		Conta conta = new Conta();
		conta.setNumero(20069);
		System.out.println(conta.getNumero());
		
		//testa classe cliente com encapsulamento//
		Cliente cliente = new Cliente(); 
		cliente.setNome("Talitha Gonçalves Rosa");
		cliente.setCpf("12345678900");
		cliente.setProfissao("Garota de Programa");
		System.out.println(cliente.getNome() + cliente.getCpf() + cliente.getProfissao());
		
		//testa cliente.conta com encapsulamento//
	}

}
