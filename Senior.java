public class Senior extends Customer {
 private final double SAVING_INTEREST, CHECK_INTEREST, CHECK_CHARGE;
 private final int OVERDRAFT_PENTALTY;

 public Senior(String name, String address, int age, String telephoneNumber) {
  super(name, address, age, telephoneNumber);
  SAVING_INTEREST = 0.08;
  CHECK_INTEREST = 0.04;
  CHECK_CHARGE = 0.01;
  OVERDRAFT_PENTALTY = 10;
 }
 public double getSavingsInterest() {
  return SAVING_INTEREST;  
 }

 public double getCheckInterest() {
  return CHECK_INTEREST;
 }

 public double getCheckCharge() {
  return CHECK_CHARGE;
 }

 public int getOVERDRAFT_PENTALTY() {
  return OVERDRAFT_PENTALTY;
 }



}
