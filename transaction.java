public class transaction {
 private String customerNum, date, fees;
 private int transactiontype;
 private double amount;
 
 public transaction(String customerNum, 
                    int transactiontype, String date, String fees, double amount){
  
   this.amount=amount;
   this.customerNum=customerNum;
   this.transactiontype = transactiontype;
   this.date=date;
   this.fees=fees;
 }


 //getter and setter
 public String getCustomerNum() {
   return customerNum;
 }

 public void setCustomerNum(String customerNum) {
   this.customerNum = customerNum;
 }

 public int getTransactiontype() {
   return transactiontype;
 }

 public void setTransactiontype(int transactiontype) {
   this.transactiontype = transactiontype;
 }

 public String getDate() {
   return date;
 }

 public void setDate(String date) {
   this.date = date;
 }

 public String getFees() {
  return fees;
 }

 public void setFees(String fees) {
  this.fees = fees;
 }

 public double getAmount() {
  return amount;
 }

 public void setAmount(int amount) {
  this.amount = amount;
 }

 public void processTrans(){ //print account information
   System.out.println("Account information");
 }
}
