package firstCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StringOrdenation {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		Comparator organizedByLenght = new SizeComparator();
		words.add("Fazenda vegana");
		words.add("Farm of the godd will");
		words.add("Armamento do amor");
		words.add("Trator de paz");
		words.add("Zigdust Stardust");
		
		System.out.println("---------Using comparable from Collections class------------");
		Collections.sort(words); //Use comparable.
		System.out.println(words);
		
		System.out.println("---------Using comparable method that I created------------");
		Collections.sort(words, organizedByLenght); //Using compare method that I overrided in SizeComparator.Class.
		System.out.println(words);
		
		System.out.println("---------Using Java 8------------");
		words.sort(organizedByLenght); //Java8, arguments are shorter
		System.out.println(words);
		
		System.out.println("---------Printing element by element------------");
		for (String word : words) {
			System.out.println(word);
			
		}
		
		System.out.println("---------Using Java 8 to print element by element------------");
		Consumer<String> stringEater= new LinePrinting();
		words.forEach(stringEater);
		
		System.out.println("---------Using Java 8 with lambdas------------");
		words.sort((s1, s2) -> {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
		});
		System.out.println(words);

      System.out.println("---------Using Java 8 with lambdas, even more short------------");
		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(words);
	}

}
