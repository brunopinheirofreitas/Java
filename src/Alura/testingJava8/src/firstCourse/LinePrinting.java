package firstCourse;

import java.util.function.Consumer;

public class LinePrinting implements Consumer<String>{
	
	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}

}
