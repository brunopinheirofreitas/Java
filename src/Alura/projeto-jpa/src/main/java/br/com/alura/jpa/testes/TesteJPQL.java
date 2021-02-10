package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Movimentacao;

public class TesteJPQL {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		//String query = "select * from contas;"; -- Classic querry.
		//Using parameters
		
		String jpql = "select m from Movimentacao m where m.conta.id = :pConta order by m.valor desc";
		TypedQuery<Movimentacao> createQuery = em.createQuery(jpql, Movimentacao.class);
		createQuery.setParameter("pConta", 2L);		
		
		List<Movimentacao> resultList = createQuery.getResultList();
		
		for (Movimentacao movimentacao : resultList) {
			System.out.println(movimentacao);
		}
		

		
		

	}

}
