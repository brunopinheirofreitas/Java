package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TestaRelatorioDasMovimentacoes {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c from Conta c join fetch c.movimentacoes";
		TypedQuery<Conta> query = em.createQuery(jpql, Conta.class);
		List<Conta> resultList = query.getResultList();
		for (Conta conta : resultList) {
			System.out.println("Titular: " + conta.getTitular().getNome());
			System.out.println("Conta: " + conta.toString());
			List<Movimentacao> resultMovimentacoes = conta.getMovimentacao();
			for (Movimentacao movimentacoes : resultMovimentacoes) {
				System.out.println("Movimentacoes: " + movimentacoes.toString());
			}
			System.out.println("=================================================");
			
		}

	}

}
