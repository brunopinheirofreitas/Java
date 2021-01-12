package bytebank;

public class JavaLangStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Bruno"; //This is an literal object
		String other = new String ("Bruno"); //It's not a good practice.
		
		//Look for more information about java.lang to handle strings.
		
		String corrected = nome.replace("u", "e");
		
		nome.toLowerCase();
		
		System.out.println(nome);
		System.out.println(corrected);
		
	}

}
