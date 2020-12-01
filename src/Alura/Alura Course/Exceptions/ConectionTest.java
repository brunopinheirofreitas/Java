
public class ConectionTest {

	public static void main(String[] args) {
		
		//Smaller code
		try (Conection conection = new Conection()) {
			conection.getData();
		} catch (IllegalStateException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		//Bigger code
		/*
		 * Conection conection = null; try { conection = new Conection();
		 * conection.getData(); conection.close(); } catch (IllegalStateException ex) {
		 * System.out.println(ex.getMessage()); } finally { conection.close(); }
		 */

	}
}
