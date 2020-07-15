
public class Invoice {
	
	String invoiceNumber;
	String invoiceDescription;
	int itemQuantity;
	double itemPrice;
	
	public Invoice (String invoiceNumber, String invoiceDescription, int itemQuantity, double itemPrice) {
		this.invoiceNumber = invoiceNumber;
		this.invoiceDescription = invoiceDescription;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		
		if (itemQuantity < 0 ) {
			itemQuantity = 0;
		}
		if (itemPrice < 0.0 ) {
			itemPrice = 0.0;
		}
		
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceDescription() {
		return invoiceDescription;
	}

	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public double getInvoiceAmount () {
		double itemAmountValue = itemQuantity * itemPrice;
		return itemAmountValue;
	}
	
	

}
