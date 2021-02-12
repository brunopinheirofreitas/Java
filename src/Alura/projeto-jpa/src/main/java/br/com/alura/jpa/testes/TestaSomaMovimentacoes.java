package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import br.com.alura.jpa.dao.MovimentacaoDao;
import br.com.alura.jpa.modelo.MediaComData;
import br.com.alura.jpa.modelo.Movimentacao;

public class TestaSomaMovimentacoes {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
//		Using JPQL
		
//		String jqpl = "select sum(m.valor) from Movimentacao m";//		
//		TypedQuery<BigDecimal> query = em.createQuery(jqpl, BigDecimal.class);
//		BigDecimal singleResult = new MovimentacaoDao(em).getSomaDasMovimentacoes();
		
//		Using Criteria		
		
//		CriteriaBuilder builder = em.getCriteriaBuilder(); 
//		CriteriaQuery<BigDecimal> query = builder.createQuery(BigDecimal.class);		
//		Root<Movimentacao> root = query.from(Movimentacao.class);		
//		//sum(m.valor) from Movimentacao class.
//		Expression<BigDecimal> sum = builder.sum(root.<BigDecimal>get("valor"));
//		query.select(sum);		
//		TypedQuery<BigDecimal> typedQuery = em.createQuery(query);		
//		System.out.println("Resultado das movimentacoes: " + typedQuery.getSingleResult());
		
//		Testa group by
		
//		List<MediaComData> resultAVG = new MovimentacaoDao(em).getMediaDiariaDasMovimentacoes();
		
//		Using JPQL
		
//		String jqpl2 = "select new br.com.alura.jpa.modelo.MediaComData(avg(m.valor), day(m.data), month(m.data)) from Movimentacao m group by day(m.data), month(m.data)";
//		TypedQuery<MediaComData> queryAVG = em.createQuery(jqpl2, MediaComData.class);
//		List<MediaComData> resultAVG = queryAVG.getResultList();
		
//		for (MediaComData mediaObj : resultAVG) {
//			System.out.println("Media das movimentacoes: " + mediaObj.getValor() + " em: " + mediaObj.getMonth() + "/" + mediaObj.getDay());			
//		}
		
//	Using Criteria with dynamic queries		
		
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);
		
		List<Movimentacao> movimentacoesFiltradasPorData = movimentacaoDao.getMovimentacoesFiltradasPorData(1, null, null);
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData) {
			System.out.println("Filto dia: " + movimentacao.toString());
			System.out.println("=======================================================");
		}
		List<Movimentacao> movimentacoesFiltradasPorData2 = movimentacaoDao.getMovimentacoesFiltradasPorData(null, 2, null);
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData2) {
			System.out.println("Filto Mes: " + movimentacao.toString());
			System.out.println("=======================================================");
		}
		List<Movimentacao> movimentacoesFiltradasPorData3 = movimentacaoDao.getMovimentacoesFiltradasPorData(null, null, 2017);
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData3) {
			System.out.println("Filto Ano: " + movimentacao.toString());
			System.out.println("=======================================================");
		}
		List<Movimentacao> movimentacoesFiltradasPorData4 = movimentacaoDao.getMovimentacoesFiltradasPorData(1, 1, 2020);
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData4) {
			System.out.println("Filto Completo: " + movimentacao.toString());
			System.out.println("=======================================================");
		}
		
		

	}

}
