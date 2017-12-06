

public class SavingsAccount extends Account{
  public SavingsAccount(Customer customer){
  this.customer = customer;
  this.balance =0;
  accountNumber++;
  
  
  }
  public double deposit(double amount){
    if (TransIndex == transArray.length){
      reallocate();
    }
    transArray[TransIndex] = new transaction(customer.getCustomerNumber(),0,"Date","DEP",amount);
    TransIndex++;
    setBalance(balance + amount);
	return getBalance();
  }

  public double withdral(double amount){
    if (TransIndex == transArray.length){
      reallocate();
    }
    transArray[TransIndex] = new transaction(customer.getCustomerNumber(),0,"Date","WITHDRAL",amount);
    TransIndex++;
    setBalance(balance - amount);
	return getBalance();
  }

}