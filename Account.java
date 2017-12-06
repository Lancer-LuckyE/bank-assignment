abstract class Account {
	protected Customer customer;
	protected double balance = 0;
	protected int accountNumber;
	protected transaction[] transArray = new transaction[INIT_CAPACITY];
	protected static final int INIT_CAPACITY = 20;
	protected int Arraysize = 0;
	protected static int TransIndex = 0;

	public void reallocate() { // not finished
		// double the size when it becomes full
		if ((transArray.length) == Arraysize) {

		}
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}

	public String getAccountNum() {
		// get account Number
		return customer.getCustomerNumber();
	}

	public abstract double deposit(double amount);

	public abstract double withdral(double amount);

}
