import com.car.carClass;
public class classExerciseCar {
    // CLASS EXERCISE ON CAR MAKE AND DOORS
    public static void main(String[] args) {
        System.out.println("Hello Welcome to my First class exercise on OOP1 ");
// Exercise requires two objects to be created .

        //object 1..
        carClass car1 = new carClass("BMW ", 4);
        car1.setMake("Tesla");
        System.out.println(car1.get_make());
        car1.showDetails();

        // object2.
        carClass car2 = new carClass("Bugatti", 2);
        car2.setMake("Bentley");
        car2.setDoors(4);
        System.out.println(car2.get_make());
        car2.showDetails();

        // object3
        carClass car3 = new carClass("Toyota", 4);
        car3.showDetails();

        //object 4
        carClass car4 = new carClass("Chevrolet", 4);
        car4.setDoors(2);
        car4.showDetails();

// finished class exercise . car class and 4 objects...

    }
}
