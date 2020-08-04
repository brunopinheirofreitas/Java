package Q418;
import java.util.Scanner;


public class ClientBalanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int clientChoice;
		int creditAnalysisResult;
		int clientExpenditure;
		int clientCredit;
		Scanner clientInput = new Scanner (System.in);
		ClientBalance storeClient = new ClientBalance (1000, 666);
		
		System.out.println("Welcome to Lolita's Shop");
		System.out.println("Your account number is: " + storeClient.getAccountNumber());
		System.out.println("Do you want to register a initial balance?");
		System.out.println("Please press (1) for Yes.");
		System.out.println("Please press (2) for No.");
		System.out.print(": ");
		clientChoice = clientInput.nextInt();
		while (clientChoice < 1 || clientChoice > 2) {
			System.out.println("Invalid answer");
			System.out.println("Do you want to register a initial balance?");
			System.out.println("Please press (1) for Yes.");
			System.out.println("Please press (2) for No.");
			System.out.print(": ");
			clientChoice = clientInput.nextInt();
		}
		if (clientChoice == 1) {
				System.out.print("Please insert the initial amount: ");
				storeClient.setInitialBalance(clientInput.nextInt());
		} else if (clientChoice == 2) {
				storeClient.setInitialBalance(0);
		}
		
		System.out.println();
		
		System.out.println("Please insert monthly expenditures");
		System.out.println("To stop inserting monthly expenditures just press -1");
		System.out.print(": ");	
		clientExpenditure = clientInput.nextInt();
		while (clientExpenditure != -1) {
			storeClient.setMontlhyExpenditures(clientExpenditure);
			System.out.print(": ");
			clientExpenditure = clientInput.nextInt();
		}
		System.out.println("Monthly Expenditures register has ended");
		
		System.out.println();
		
		System.out.println("Please insert monthly credits");
		System.out.println("To stop inserting monthly credits just press -1");
		System.out.print(": ");
		clientCredit = clientInput.nextInt(); 
		while (clientCredit != -1) {
			storeClient.setMontlhyCredit(clientCredit);
			System.out.print(": ");
			clientCredit = clientInput.nextInt();
		}
		System.out.println("Monthly Credit register has ended");
		
		System.out.println();
		
		creditAnalysisResult = storeClient.getInitialBalance() + storeClient.getMonthlyExpenditures() - storeClient.getMonthlyCredit();
		
		if (creditAnalysisResult > storeClient.getAuthorizedCredit()) {
			System.out.println("Credit Limit Exceeded");
		} else {
			System.out.print("Available limit: " + (storeClient.getAuthorizedCredit() - creditAnalysisResult));
		}
		

	}

}
