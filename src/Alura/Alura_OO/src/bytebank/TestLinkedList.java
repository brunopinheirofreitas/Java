package bytebank;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Conta> lista = new LinkedList<Conta>();
			
			Conta cc = new ContaCorrente(22,11);
			lista.add(cc);
			
			Conta cc2 = new ContaCorrente(22,22);
			lista.add(cc2);
			
			System.out.println("Tamanho: " + lista.size());
			
			Conta ref = (Conta) lista.get(0);
			System.out.println(ref.getNumero());
			
			lista.remove(0);
			
			System.out.println("Tamanho: " + lista.size());
			
			Conta cc3 = new ContaCorrente(22,33);
			lista.add(cc3);
			
			Conta cc4 = new ContaCorrente(22,44);
			lista.add(cc4);
			
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

		}

}
