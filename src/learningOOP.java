import Objects.firstClass;
public class learningOOP {
public static void main(String[] args){
    System.out.println("Hello Welcome to my First object Creation");

    //Creating first object using the class firstClass as the blueprint.
    firstClass accountNew = new firstClass(105241654,"WILLIAM KAGOIYO WABUIYA",100000);

    accountNew.checkBalance();
    accountNew.deposit(6000);
    accountNew.withdraw(2000);


    firstClass account1 = new firstClass(105741561,"JAY two cents",150000);
    account1.setBalance(200000);
    System.out.println(account1.getBalance());
    account1.checkBalance();
    account1.deposit(10000);

    }
}
