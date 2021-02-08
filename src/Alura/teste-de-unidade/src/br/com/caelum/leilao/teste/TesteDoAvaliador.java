package br.com.caelum.leilao.teste;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import org.hamcrest.*;


public class TesteDoAvaliador {
		
	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	@Before //This method will be automatic used by the test class 
	public  void criaAvaliador() {
		this.leiloeiro = new Avaliador();		
		this.joao = new Usuario("joao");
		this.jose = new Usuario("Jose");
		this.maria = new Usuario("Maria");
	}
	
	@After
	public void fimDosTestes() {
		System.out.println("Fim dos Testes");
	}
	
	@Test
	public void comparandoLances() {
		
		Leilao leilao = new CriadorDeLeilao().para("DescricaoDoLeilao")
				.lance(joao, 100)
				.lance(maria, 200)
				.lance(joao, 300)
				.lance(maria, 500)
				.constroi();
		
		//Deixando a maquina comparar.
		
		double maiorLance = 500.0;
		double menorLance = 100.0;
		leiloeiro.avalia(leilao);		
		assertEquals(maiorLance, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorLance, leiloeiro.getMenorLance(), 0.00001);
		
		//Using Hamcrest to improve test class legibility
		
		//org.hamcrest.MatcherAssert.assertThat(leiloeiro.getMenorLance(), equalTo(100));
		//assertThat(leiloeiro.getMenorLance(), equalTo(100));
		
	}

	@Test
	public void deveEntenderLeilaoComUmLance () {

		Leilao leilao = new Leilao("Leilao de Piscinas de bolinha");
		leilao.propoe(new Lance(joao, 150.0));
		leiloeiro.avalia(leilao);
		assertEquals(150.0, leiloeiro.getMaiorLance(), 0.0000001);
		assertEquals(150.0, leiloeiro.getMenorLance(), 0.0000001);
	}
	
	@Test
	public void deveEntenderLeilaoMaioresLances () {
		Leilao leilao = new Leilao("Fusca 86");
		leilao.propoe(new Lance(joao, 2000));
		leilao.propoe(new Lance(maria, 3000));
		leilao.propoe(new Lance(joao, 4000));
		leilao.propoe(new Lance(maria, 10000));
		
		
		
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		for (Lance lance : maiores) {
			System.out.println(lance.getValor());
		}
		assertEquals(3, maiores.size());
		assertEquals(2000, maiores.get(0).getValor(), 0.00001);
		assertEquals(3000, maiores.get(1).getValor(), 0.00001);
		assertEquals(4000, maiores.get(2).getValor(), 0.00001);
		
		
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarLeilaoSemLance () {
		Leilao leilao = new CriadorDeLeilao().para("Vasos de Barro").constroi();
		leiloeiro.avalia(leilao);
	}
	
}
