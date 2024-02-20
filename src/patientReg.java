import com.homework.Patient;
import java.util.Scanner;
public class patientReg {
    public static void main(String[] args){
        System.out.println("Patient System:");
        //Creating first object using the class Patient as the blueprint.
// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for account details...
        System.out.println("Enter Patient Name:");
        String patientName = scanner.nextLine();

        System.out.println("Enter Patient Id:");
        int patientId = scanner.nextInt();

        System.out.println("Enter Patient Age:");
        int patientAge = scanner.nextInt();
        if (patientAge<100&&patientAge>0){
            System.out.println("Correct value entered");
        }else {
            System.out.println("Please enter appropriate Value");
            patientAge = scanner.nextInt();
        }

        System.out.println("Enter Patient Gender");
        // Read the first character entered by the user
        // Note: next() reads the next token, and charAt(0) extracts the first character of the token
        char gender = scanner.next().charAt(0);
        if (gender=='M'|| gender=='F'){
            System.out.println("Correct Char entered");
        }else {
            System.out.println("Please Enter Correct Gender Character:");
            gender = scanner.next().charAt(0);
        }


        //Creating Patient object with user Input Values...
        Patient myPatient = new Patient(patientId, patientName, patientAge, gender);

        //Performing Methods / Functions.
        System.out.println("Patient Details are :");
        myPatient.checkDetails();


        // Close the Scanner to prevent resource leak
        scanner.close();

    }

}
