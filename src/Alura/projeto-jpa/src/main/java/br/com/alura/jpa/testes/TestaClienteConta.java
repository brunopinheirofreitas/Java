package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaClienteConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta2 = em.find(Conta.class, 2L);
		Conta conta3 = em.find(Conta.class, 3L);
		Conta conta4 = em.find(Conta.class, 4L);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Mozart Penha");
		cliente.setProfissao("Corredor de carro de corrida");
		cliente.setEndereco("Rua do Ouvidor, Orelha, Rosto");
		cliente.setConta(conta2);
		conta2.setTitular(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Tonico Da Silva");
		cliente2.setProfissao("Obstetra");
		cliente2.setEndereco("Rua do Sanguesuga, Pantano, Tenebras");
		cliente2.setConta(conta4);
		conta4.setTitular(cliente2);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Alvarez Azevedo");
		cliente3.setProfissao("Cavaleiro");
		cliente3.setEndereco("Rua do Reinor, Gondor, TirithMines");
		cliente3.setConta(conta3);
		conta3.setTitular(cliente3);
				
		em.getTransaction().begin();
		em.persist(conta2);
		em.persist(conta3);
		em.persist(conta4);
		em.persist(cliente);
		em.persist(cliente2);
		em.persist(cliente3);
		em.getTransaction().commit();
		em.close();

	}

}
