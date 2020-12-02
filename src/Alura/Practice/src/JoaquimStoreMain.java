import java.math.BigDecimal;
import java.util.Date;
public class JoaquimStoreMain {

	public static void main(String[] args) {
		
		//Creating objects
		JoaquimStoreProduct storeBoots;
		JoaquimStoreProduct storeSandals;
		JoaquimStoreProduct storeCasual;
		JoaquimStoreProduct storeTennis;
		JoaquimStoreProduct storeFormal;
		/*
		 * FORMAL_SHOE(1), BOOT(2), TENNIS(3), SANDAL(4), CASUAL_SHOE(5);
		 */
		JoaquimStoreManager managerOne;
		JoaquimStoreManager managerTwo;
		JoaquimStoreVendor vendorOne;
		JoaquimStoreVendor vendorTwo;
		JoaquimStoreVendor vendorThree;
		JoaquimStoreVendor vendorFour;
		JoaquimStoreVendor vendorFive;
		JoaquimStoreVendor vendorSix;
		JoaquimStoreVendor vendorSeven;
		
		int[] managerTeam;
		
		//Creating enum objects
		Gender maleGender = Gender.MALE;
		Gender femaleGender = Gender.FEMALE;
		Gender noGender = Gender.NO_GENDER;
		ProductType formalShoe = ProductType.FORMAL_SHOE;
		ProductType boot = ProductType.BOOT;
		ProductType tennis = ProductType.TENNIS;
		ProductType sandal = ProductType.SANDAL;
		ProductType casualShoe = ProductType.CASUAL_SHOE;		
		
		//Creating products
		
		storeBoots = new JoaquimStoreProduct("SnowBoot", 40, new BigDecimal(150.00), boot, maleGender);
		storeBoots.setProductQuantity(10);
		storeSandals = new JoaquimStoreProduct("OldManSandals", 39, new BigDecimal (75.00), sandal, maleGender);
		storeSandals.setProductQuantity(8);
		storeCasual = new JoaquimStoreProduct("CasualShoe", 42, new BigDecimal(125.00), casualShoe, femaleGender);
		storeCasual.setProductQuantity(6);
		storeTennis = new JoaquimStoreProduct("BoltTennis", 36, new BigDecimal(100.0), tennis, femaleGender);
		storeTennis.setProductQuantity(4);
		storeFormal = new JoaquimStoreProduct("WorkShoe", 35, new BigDecimal (350.00), formalShoe, noGender);
		storeFormal.setProductQuantity(1);
		
		//Testing enum
		System.out.println("Enum is working?");
		System.out.println("Name: " + maleGender.name());
		System.out.println("Position: " + maleGender.ordinal());
		System.out.println("Value: " + maleGender.getGender());
		System.out.println("Name: " + casualShoe.name());
		System.out.println("Positon: " + casualShoe.ordinal());
		System.out.println("Value: " + casualShoe.getValue());
		
		//Getting Product Info
		System.out.println("Product 01: " + storeBoots.getProductInfo());
		System.out.println("Product 02: " + storeSandals.getProductInfo());
		
		
		//Creating Vendor
		
		vendorOne = new JoaquimStoreVendor("Boss", "Hugo", "25/11/1996", new BigDecimal (1000.0));
		vendorTwo = new JoaquimStoreVendor("Heinz", "Aurelius", "18/03/1976", new BigDecimal (900.0));
		vendorThree = new JoaquimStoreVendor("Klain", "Kalvin", "11/08/1999", new BigDecimal (800.0));
		vendorFour = new JoaquimStoreVendor("Wayne", "Bruce", "01/07/1991", new BigDecimal (850.0));
		vendorFive = new JoaquimStoreVendor("Kent", "Klark", "29/09/2004", new BigDecimal (1050.0));

		//Creating Manager
		
		managerOne = new JoaquimStoreManager("Hemme", "Arthur", "22/07/1985", new BigDecimal (5000.0));
		managerTwo = new JoaquimStoreManager("Dickenson", "Bruce", "12/03/1968", new BigDecimal (8000.0));

		//Setting Hierarchy
		

		
		JoaquimStoreHierarchy.setJoaquimStoreHierarchy(0, managerOne, vendorOne);
		JoaquimStoreHierarchy.setJoaquimStoreHierarchy(0, managerTwo, vendorTwo);
		JoaquimStoreHierarchy.setJoaquimStoreHierarchy(1, managerTwo, vendorThree);
		JoaquimStoreHierarchy.setJoaquimStoreHierarchy(2, managerTwo, vendorFour);
		JoaquimStoreHierarchy.setJoaquimStoreHierarchy(3, managerTwo, vendorFive);
		
		//Testing Vendor general methods
		
		System.out.println("Manager: " + JoaquimStoreHierarchy.getVendorManager(vendorTwo).getColaboratorInformation());
		System.out.println("Vendor IdNumber: " + vendorTwo.getColaboratorIdNumber());
		System.out.println(vendorTwo.getColaboratorInformation());
		System.out.println("Total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorTwo));
		System.out.println("Gross Income: " + vendorTwo.getColaboratorGrossIncome());
		System.out.println("Variable Income: " + vendorTwo.getColaboratorVariableIncome());
		System.out.println("Variable Income Percentage: " + (100*vendorTwo.getMaxVariableIncome()) + "%");
		System.out.println("Vendor maximum discount allowed: " + JoaquimStoreVendor.getVendorMaxDiscount());
		vendorFour.setDiscountPassword(2222);
		//Testing Manager general methods
		
		//Getting Manager team
		managerTwo.setCashierPassword(1111);
		managerTwo.setDiscountPassword(4444);
		System.out.println("Printing Manager team!");
		System.out.println("Manager: " + managerTwo.getColaboratorFamilyName());
		for (int i = 0; i < managerTwo.getManagerTeam().length; i++) {
			if (managerTwo.getManagerTeam()[i]!=null) {
				System.out.println("Team: " + JoaquimStoreHierarchy.getJoaquimStoreHierarchy(managerTwo)[i].getColaboratorInformation());
			}
		}
		System.out.println("ManagerOne MaxDiscount: " + managerTwo.getManagerMaxDiscount());
		System.out.println("ManagerOne Variable Income Percentage: " + (100*managerTwo.getManagerMaxVariableIncome())+"%");
		
		//Creating a Client
		JoaquimStoreClient clientTwo = new JoaquimStoreClient("Parker", "Peter", 123456);
		JoaquimStoreClient clientOne = new JoaquimStoreClient("Stark", "Tony", 6598456);
		
		//Selling something
		
		JoaquimStoreSale saleOne = new JoaquimStoreSale(storeCasual, vendorTwo, clientTwo, "Sale of a normal shoe for a teenager");
		JoaquimStoreSale saleTwo = new JoaquimStoreSale(storeBoots, vendorThree, clientTwo, "Sale of a boot for a teenager");
		JoaquimStoreSale saleThree = new JoaquimStoreSale(storeFormal, vendorOne, clientOne, "Sale of a formal shoe for a gentleman");
		
		//Testing Sale Methods
		System.out.println("Product sold: " + saleOne.getProductInfo());
		System.out.println("Product Price: " + saleOne.getProductPrice());
		System.out.println("Product Discount: " + saleOne.getProductDiscount());
		System.out.println("Product Final Price: " + saleOne.getProductFinalPrice());
		
		//Testing paystub methods
		
		System.out.println("Manager total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(managerTwo));
		System.out.println("Vendor total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorOne));
		System.out.println("Vendor total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorTwo));
		System.out.println("Vendor total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorThree));
		System.out.println("Vendor total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorFour));
		System.out.println("Vendor total income: " + JoaquimStoreColaboratorPayStub.payStubColaborator(vendorFive));
		
		//Testing discount
		System.out.println("SETTING A DISCOUNT TO A PRODUCT");
		saleOne.setVendorProductDiscount(vendorOne, 0000, 100);
		System.out.println("Product sold: " + saleOne.getProductInfo());
		System.out.println("Product Price: " + saleOne.getProductPrice());
		System.out.println("Product Discount: " + saleOne.getProductDiscount());
		System.out.println("Product Final Price: " + saleOne.getProductFinalPrice());
		
		//Testing devolutions
		System.out.println("Product info and quantity: " + saleOne.getProductInfo());
		System.out.println("I'm returning this.");
		saleOne.setSaleDevolution(true);
		System.out.println("Product info and quantity: " + saleOne.getProductInfo());
		
		//Testing excpetions
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("Trying exceptions");
		System.out.println("Sale three: " + saleThree.getProductInfo());
		try {
			JoaquimStoreSale saleFour = new JoaquimStoreSale(storeFormal, vendorOne, clientOne, "Sale of a formal shoe for a gentleman, again");
		} catch (ProductSellException ex) {
			System.out.println("Canceling sell.");
			System.out.println("Returning...");
		} 
	}

}
