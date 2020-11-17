
public class testeEnum {

	public static void main(String[] args) {
		
		Priority pMin = Priority.MIN;
		Priority pNormal = Priority.NORMAL;
		Priority pMax = Priority.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMin.ordinal());
		System.out.println(pMin.getValor());

	}

}
