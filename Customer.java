public abstract class Customer {
	private String name;
	private String address;
	private int age;
	private String telephoneNumber;
	private String customerNumber;

	public Customer(String name, String address, int age, String telephoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.telephoneNumber = telephoneNumber;
		setCustomerNumber(telephoneNumber);
	}

	public abstract double getSavingsInterest();

	public abstract double getCheckInterest();

	public abstract double getCheckCharge();

	// getter and setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public String getCustomerNumber() {
		return this.customerNumber;
	}

}