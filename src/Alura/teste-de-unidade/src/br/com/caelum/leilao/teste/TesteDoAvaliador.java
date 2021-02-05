package br.com.caelum.leilao.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;


public class TesteDoAvaliador {
	
	@Test
	public void comparandoLances() {
		Usuario joao = new Usuario("joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PS4");
		
		leilao.propoe(new Lance(joao, 500.0));
		leilao.propoe(new Lance(jose, 450.0));
		leilao.propoe(new Lance(maria, 1.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		//Deixando a maquina comparar.
		
		double maiorLance = 500.0;
		double menorLance = 1.0;
		
		assertEquals(maiorLance, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorLance, leiloeiro.getMenorLance(), 0.00001);
		
	}
	
	@Test
	public void deveEntenderLeilaoComUmLance () {
		Usuario joao = new Usuario("Joao");
		Leilao leilao = new Leilao("Leilao de Piscinas de bolinha");
		
		leilao.propoe(new Lance(joao, 150.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		assertEquals(150.0, leiloeiro.getMaiorLance(), 0.0000001);
		assertEquals(150.0, leiloeiro.getMenorLance(), 0.0000001);
	}
	
	@Test
	public void deveEntenderLeilaoMaioresLances () {
		Usuario joao = new Usuario("Joao");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Fusca 86");
		
		leilao.propoe(new Lance(joao, 2000));
		leilao.propoe(new Lance(maria, 3000));
		leilao.propoe(new Lance(joao, 4000));
		leilao.propoe(new Lance(maria, 10000));
		
		Avaliador leiloeiro = new Avaliador();
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
	
}
