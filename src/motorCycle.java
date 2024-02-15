import com.william.Classwork.Motorcycle;
public class motorCycle {
    public static void main(String[] args){
        System.out.println("MotorCycle classes and objects");
        // initialise  an Object of motorcycle using an empty construct.

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.setMotorName("Electric Price");
        motorcycle1.setPrice(15000f);
        motorcycle1.showDetails();

        //Create another object of motorcycle using the second constructor with one parameter...
        Motorcycle motorcycle2 = new Motorcycle("Scooter");
        motorcycle2.setPrice(24000f);
        motorcycle2.showDetails();

        // Create another object of motorcycle using third constructor...
        Motorcycle motorcycle3 = new Motorcycle("Gas Bike", 19000f);
        motorcycle3.showDetails();

    }
}
