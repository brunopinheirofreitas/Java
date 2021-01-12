package bytebank;

public class ObjectClassStudy {
	
	public static void main(String[] args) {
		
		//Array
		
		int[] idades = new int[5]; // every positon by default has the value 0;
		
		int idade1;
		System.out.println(idade1 = idades[0]); //setting a value to an INT by a specific position of an array
		
		//int idade2 = idades[50]; // java.lang.ArrayIndexOutOfBoundsException be used to hehehehe
		System.out.println(idades.length); // dimension of an array
		
		for (int i=0; i<idades.length; i++) {
			idades[i] = i;
		}
		
		for (int i=0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		
	}

}
