import com.william.Classwork.AccountTi;
import com.william.Classwork.SavingsAccount;
public class MainAccounts {
//Main method for execution of bank accounts....
       public static void main(String[] args){
// Savings Account ....
       System.out.println("Hello to your Savings Account...");
       AccountTi accountNew1 = new AccountTi("WILL13456", 600000);
       accountNew1.showDetails();
       SavingsAccount accountNew2 = new SavingsAccount("WILL13456", 600000,1.5);
       accountNew2.withdraw(2500);
       accountNew2.showDetails();
       }
}
