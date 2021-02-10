package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamento {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
//		Cliente titular = new Cliente();
//		titular.setNome("Murilo");
//		
//		Conta conta = new Conta((long)4658,(long)165484,titular);
//		conta.setSaldo(300.0);
		
		Conta conta = em.find(Conta.class, 2L);
				
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Restaurante");
		movimentacao.setValor(new BigDecimal(45.00));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setData(LocalDateTime.now());
		movimentacao2.setDescricao("Yoga");
		movimentacao2.setValor(new BigDecimal(25.00));
		movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao2.setConta(conta);
		
		em.getTransaction().begin();
		em.persist(movimentacao);
		em.persist(movimentacao2);
		em.getTransaction().commit();
		em.close();
		
	}
	


}
