package bytebank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OrderingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
collections
		Cliente cl1 = new Cliente();
		cl1.setNome("Paulo Silveira");
		Cliente cl2 = new Cliente();
		cl2.setNome("Bruno Freitas");
		Cliente cl3 = new Cliente();
		cl3.setNome("Talitha Rosa");
		Cliente cl4 = new Cliente();
		cl4.setNome("Gustavo Galvao");

		List<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(11,33);
		lista.add(cc);
		cc.setTitular(cl1);

		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		cc2.setTitular(cl2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(55,44);
		lista.add(cc3);
		cc3.setTitular(cl3);

		Conta cc4 = new ContaCorrente(44,99);
		lista.add(cc4);
		cc4.setTitular(cl4);

		for (int i=0; i<lista.size(); i++) {

			Conta ref1 = (Conta) lista.get(i);
			System.out.println(ref1.getNumero());
		}

		for (int i=0; i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("------");

		//Common form
		for (Object o : lista) {
			System.out.println(o);
		}

		List<Conta> listOrdering = new ArrayList<>(); //Ordering
		listOrdering.add(cc);
		listOrdering.add(cc2);
		listOrdering.add(cc3);
		listOrdering.add(cc4);

		System.out.println("-----------------Printing without order by number----------------");

		for (Conta conta : listOrdering) {
			System.out.println(conta);
		}

		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		listOrdering.sort(comparator);

		System.out.println("-----------------Ordening by number----------------");

		for (Conta conta : listOrdering) {
			System.out.println(conta);
		}
		
		TitularDaContaComparator titularComparator = new TitularDaContaComparator();
		listOrdering.sort(titularComparator);

		System.out.println("-----------------Ordening by client----------------");

		for (Conta conta : listOrdering) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) { //Compare two strings
		// TODO Auto-generated method stub

		String nameC1 = c1.getTitular().getNome();
		String nameC2 = c2.getTitular().getNome();

		return nameC1.compareTo(nameC2);

	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) { //Automatic import from Comparator interface.
		// TODO Auto-generated method stub
		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
	}
}