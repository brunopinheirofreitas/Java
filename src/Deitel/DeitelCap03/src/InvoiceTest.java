
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice firstInvoice = new Invoice ("01", "Television", 1, 550.0);
		
		System.out.printf("Client has buyed %d %s for %.2f through invoice %s", firstInvoice.getItemQuantity(), firstInvoice.getInvoiceDescription(), firstInvoice.getInvoiceAmount(), firstInvoice.getInvoiceNumber());

	}

}
