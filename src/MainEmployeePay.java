import com.homework.EmployeePay;
import com.homework.InvoicePay;
public class MainEmployeePay {
    public static void main(String[] args){
        System.out.println("Employee Sales \n");
        InvoicePay invoice1 = new InvoicePay("Dress",5,2500);
        EmployeePay employee1 = new EmployeePay("John","Doe", 90000);
        invoice1.showDetails();
        System.out.println("\n");
        employee1.showDetails();
    }
}
