import com.assignments.Person;
import com.assignments.Teacher;
import com.assignments.Student;
// Main Class to execute the program showcasing Inheritance...
public class inheritanceMain {
    public static void main(String[] args){
        System.out.println("Showcasing how inheritance works");
        // creating an instance of a person.
        Person person1 = new Person("Johnson Muthua",25);
        person1.setName("William Kagoiyo");
        person1.setAge(15);
        person1.displayInfo();
        //Creating Instance of Teacher subclass.
        Teacher teacher1 = new Teacher("Mr Smith", 34, "Math",63);
        teacher1.displayTeacherInfo();
        //Creating Student instance from student class.
        Student student1 = new Student("Martin", 15, 105,6);
        student1.displayStudentInfo();
    }
}
