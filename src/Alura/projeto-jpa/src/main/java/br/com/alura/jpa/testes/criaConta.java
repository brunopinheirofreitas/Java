package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta.Conta;

public class criaConta {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		
		//Inclusão de conta
//		Conta conta = new Conta(); 
//		conta.setTitular("Jesus");
//		conta.setNumero((long) 7777);
//		conta.setAgencia((long) 0077);
//		conta.setSaldo(77.00);
//		
//		em.getTransaction().begin();
//		em.persist(conta);
//		em.getTransaction().commit();
//		
		//Cria conta com saldo
		
//		Conta conta1 = new Conta();
//		conta1.setTitular("Jorge");
//		conta1.setNumero((long) 1574);
//		conta1.setAgencia((long) 6688);
//		conta1.setSaldo(100.0);
//		
//		em.getTransaction().begin();
//		
//		em.persist(conta1);
//		
//		em.getTransaction().commit();
		
		//Alterando dados
		
		Conta contaDoCliente = em.find(Conta.class, 4L);
		contaDoCliente.setSaldo(20.0);
		contaDoCliente.setTitular("Maurico");
		contaDoCliente.setAgencia((long) 4615);
		contaDoCliente.setNumero((long) 8465792);
		em.getTransaction().begin();
		em.persist(contaDoCliente);
		em.getTransaction().commit();
		
		//Removing
//		Conta contaDoCliente = em.find(Conta.class, 3L);
//		em.getTransaction().begin();
//		em.remove(contaDoCliente);
//		em.getTransaction().commit();
		
		//Transforming a detached object in managed.
//		Conta conta = new Conta(); 
//		conta.setTitular("Jesus");
//		conta.setNumero((long) 7777);
//		conta.setAgencia((long) 0077);
//		conta.setSaldo(77.00);
//		
//		em.getTransaction().begin();
//		em.persist(conta);
//		em.getTransaction().commit();
//		
//		System.out.println("Estou fechando a conexao");
//		em.close(); //Fechando a conexão 
//		
//		EntityManager em1 = emf.createEntityManager();
//		conta.setSaldo(700.0);
//		System.out.println("Estou abrindo nova conexao");
//		em1.getTransaction().begin();
//		em1.merge(conta);
//		em1.getTransaction().commit();
		
		//Other persistence states
		//Transient, Managed, Detached, Removed
//		Conta conta = new Conta(); 
//		conta.setTitular("Nunes");
//		conta.setNumero((long) 9248);
//		conta.setAgencia((long) 5146);
//		conta.setSaldo(600.00);
//		//Managed
//		em.getTransaction().begin();
//		em.persist(conta);
//		//Removed
//		em.remove(conta);
//		em.getTransaction().commit();
//		//Detached
//		em.close();
		
	}

}
