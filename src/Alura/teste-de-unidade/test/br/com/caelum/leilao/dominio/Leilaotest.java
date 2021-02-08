package br.com.caelum.leilao.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.servico.Avaliador;

public class Leilaotest {
	
	private Avaliador leiloeiro;

	private void criaAvaliador() {
		leiloeiro = new Avaliador();
	}

	@Test
	public void mustReceiveOneLance() { // Rememnet, it looks like a method, you have to put bra
		Leilao novoLeilao = new Leilao("Leilao Teste");

		assertEquals(0, novoLeilao.getLances().size());

		Lance novoLance = new Lance(new Usuario("Nome_Usuario_1"), 500.0);
		novoLeilao.propoe(novoLance);

		criaAvaliador();

		assertEquals(1, novoLeilao.getLances().size());
		assertEquals(500, novoLeilao.getLances().get(0).getValor(), 0.00001);

	}



	@Test
	public void mutReceiveInumerousLance() {

		Leilao novoLeilao = new Leilao("Leilao Teste");

		assertEquals(0, novoLeilao.getLances().size());

		for (int i = 0; i <= 10; i++) {
			String name = "User_" + i;
			Lance novoLance = new Lance(new Usuario(name), 500.0 + i);
			novoLeilao.propoe(novoLance);
		}

		assertEquals(11, novoLeilao.getLances().size());
		assertEquals(500, novoLeilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(501, novoLeilao.getLances().get(1).getValor(), 0.00001);
		assertEquals(502, novoLeilao.getLances().get(2).getValor(), 0.00001);
	}

	// Testing same User betting 2 times in a row
	@Test
	public void mustReceiveOnlyOneBetInARow() {
		Leilao novoLeilao = new Leilao("Leilao Teste");
		novoLeilao.propoe(new Lance(new Usuario("Nome_Usuario_1"), 500.0));
		novoLeilao.propoe(new Lance(new Usuario("Nome_Usuario_1"), 600.0));
		assertEquals(1, novoLeilao.getLances().size());
		assertEquals(500, novoLeilao.getLances().get(0).getValor());
	}



//Testing same User can bet only 5 times
	@Test
	public void mustReceiveOnlyFiveBetsFromSameUser() {
		Leilao novoLeilao = new Leilao("Leilao Teste");
		Usuario user = new Usuario("Nome_Usuario_1");
		Usuario user2 = new Usuario("Nome_Usuario_2");
		
		for (int i = 0; i <= 10; i++) {
			novoLeilao.propoe(new Lance(user, 500.0+i));
			novoLeilao.propoe(new Lance(user2, 100.0+i));
		}
		
		assertEquals(10, novoLeilao.getLances().size());
		assertEquals(502, novoLeilao.getLances().get(4).getValor());
	}

}
