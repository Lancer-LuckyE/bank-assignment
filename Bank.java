//Bank.java

/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank {
	private Account[] accounts;
	private int size; // this represents how many accounts exist in this bank
	private int capacity;
	private Customer customer;
	private Account account;
	private Account temp;

	private static final int INIT_CAPACITY = 100;
	private static final int SAVING = 0;
	private static final int CHECKING = 1;
	private static final int STUDENT = 0;
	private static final int ADULT = 1;
	private static final int SENIOR = 2;
	private static int accountIndex = 0;

	/** Creates a new instance of Bank */
	public Bank() {
		accounts = new Account[INIT_CAPACITY];
		reallocate();

	}

	/********************************************************************
	 * Creates a new account. pre: customer information must be not null and
	 * types must be valid post: New account added to bank
	 * 
	 * @param customerName
	 *            String Account owner's name
	 * @param customerAddress
	 *            String Owner's address
	 * @param customerAge
	 *            int Owner's age (in years)
	 * @param customerPhoneNumber
	 *            String Owner's phone number
	 * @param customerType
	 *            int Owner's type of customer within bank
	 * @param typeAccount
	 *            int Account type (savings or checking)
	 * @return String New account number
	 */
	public String addAccount(String customerName, String customerAddress, int customerAge, String customerPhoneNumber,
			int customerType, int typeAccount) {

		if (customerType == SENIOR) {
			customer = new Senior(customerName, customerAddress, customerAge, customerPhoneNumber);
		} else if (customerType == ADULT) {
			customer = new Adult(customerName, customerAddress, customerAge, customerPhoneNumber);
		} else if (customerType == STUDENT) {
			customer = new Student(customerName, customerAddress, customerAge, customerPhoneNumber);
		}
		// size == capacity)
		if (typeAccount == CHECKING) {
			account = new CheckingAccount(customer);
		} else if (typeAccount == SAVING) {
			account = new SavingsAccount(customer);
		}
		size++;//
		// add account into the accounts
		accounts[accountIndex] = account;
		accountIndex++;
				
		return account.getAccountNum();
	}

	/***********************************************************************
	 * Make a deposit into account. pre: amount must be a positive integer post:
	 * Account's balance increases
	 * 
	 * @param accountNumber
	 *            String Account's number
	 * @param amount
	 *            double Amount to deposit
	 * @return double New balance
	 */
	public String makeDeposit(String accountNumber, double amount) {
		int index = find(accountNumber);
		if (index >= 0) {
			accounts[index].deposit(amount);
			return Double.toString(accounts[index].getBalance());
		}else {
			return("Cannot find the account");
		}

	}

	/***********************************************************************
	 * Make a withdrawal from account. pre: amount must be a positive integer
	 * post: Account's balance decreases
	 * 
	 * @param accountNumber
	 *            String Account's number
	 * @param amount
	 *            double Amount to withdraw
	 * @return double New balance
	 */
	public String makeWithdrawal(String accountNumber, double amount) {
		int index = find(accountNumber);
		accounts[index].withdral(amount);
		return Double.toString(accounts[index].getBalance());
	}

	/***********************************************************************
	 * Returns account information as a string so it can be displayed
	 * 
	 * @param accountNumber
	 *            String Account's number
	 * @return String Account information as a String object
	 */
	public String getAccount(String accountNumber) {
		int index = find(accountNumber);
		String information = "Customer Name : " + accounts[index].getCustomer().getName() + ",Account Number :"
				+ accounts[index].getAccountNum();
		return information;
	}

	/***********************************************************************
	 * Given an account number tells if the account exists or not
	 * 
	 * @param accountNumber
	 *            String Account's number
	 * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
	 */
	private int find(String accountNumber) { // checking existance
		for (int i = 0; i < size; i++) {
			if (accounts[i].getAccountNum().equals(accountNumber)) {
				return i;
			}
		}
		return -1;
	}

	/***********************************************************************
	 * 
	 * 
	 * /** You need to create private method : Allocate to allocate a new array
	 * to hold the transactions.
	 */
	private void reallocate() {
		if (accounts.length == size) {
			capacity = capacity + 2 * INIT_CAPACITY;
			Account[] anAccount = new Account[capacity];
			for (int i = 0; i < 10; i++) {
				System.out.println("x");
			}

			// System.arraycopy(accounts,0,newAccounts,0,accounts.length);

		}
	}
}