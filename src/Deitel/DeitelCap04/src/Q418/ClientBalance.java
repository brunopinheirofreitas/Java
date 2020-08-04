package Q418;

public class ClientBalance {

	int accountNumber;
	int initialBalance;
	int monthlyExpenditures;
	int monthlyExpendituresTotal;
	int monthlyCredit;
	int monthlyCreditTotal;
	int authorizedCredit;

	public ClientBalance(int authorizedCredit, int accountNumber) {

		if (authorizedCredit < 0) {
			System.out.println("Invalid value");
		} else {
			this.authorizedCredit = authorizedCredit;
		}
		if (accountNumber == 0 || accountNumber < 0) {
			System.out.println("Invalid Account Number!");
		} else {
			this.accountNumber = accountNumber;
		}
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setInitialBalance(int initialBalance) {
		if (this.initialBalance < 0) {
			System.out.println("Invalid value for balance!");
		} else {
			this.initialBalance = initialBalance;
		}
	}

	public int getInitialBalance() {
		return this.initialBalance;
	}

	public void setMontlhyExpenditures(int monthlyExpenditures) {
			if (monthlyExpenditures > -1) {
				this.monthlyExpenditures = monthlyExpenditures;
				this.monthlyExpendituresTotal = this.monthlyExpendituresTotal + this.monthlyExpenditures;
			} else  if (monthlyExpenditures < -1 ) {
				System.out.println("Incorrect value");
			}
	}

	public int getMonthlyExpenditures() {
		return this.monthlyExpendituresTotal;
	}

	public void setMontlhyCredit(int monthlyCredit) {
			if (monthlyCredit > -1) {
				this.monthlyCredit = monthlyCredit;
				this.monthlyCreditTotal = this.monthlyCreditTotal + this.monthlyCredit;
			} else if (monthlyCredit < -1) {
				System.out.println("Incorrect value");
			}
		}

	public int getMonthlyCredit() {
		return this.monthlyCreditTotal;
	}
	
	public int getAuthorizedCredit () {
		return this.authorizedCredit;
	}

}
