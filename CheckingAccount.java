public class CheckingAccount extends Account {
	
	public CheckingAccount(Customer customer) {
		this.customer = customer;

	}

	public double deposit(double amount) {
		if (TransIndex == transArray.length) { // check if reallocate or not
			reallocate();
		}
		transArray[TransIndex] = new transaction(customer.getCustomerNumber(), 0, "Date", "DEP", amount);
		TransIndex++;
		setBalance(balance + amount);
		return getBalance();
	}

	public double withdral(double amount) {
		if (TransIndex == transArray.length) { //// check if reallocate or not
			reallocate();
		}
		transArray[TransIndex] = new transaction(customer.getCustomerNumber(), 0, "Date", "WITHDRAL", amount);
		TransIndex++;
		setBalance(balance - amount);
		return getBalance();
	}

}