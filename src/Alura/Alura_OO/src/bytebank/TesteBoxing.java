package bytebank;

import java.util.ArrayList;
import java.util.List;

public class TesteBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] idades = new int [5];
		String[] nomes = new String[5];
		
		List numeros = new ArrayList();
		numeros.add(idades); //This shouldn't work because idades is a primitive type, 
							 //nonetheless it works because java transforms a primitive type into an object.
							 //Autoboxing: when java transforms a reference in an object
							 //Unboxing: When java transforms an object in a reference.
							 //Wrapper: It's an object that store a primitive type.

	}

}
