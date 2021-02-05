package br.com.caelum.leilao.teste;

import java.util.List;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class testandoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
