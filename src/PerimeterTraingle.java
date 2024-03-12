import com.william.Classwork.RightAngleTriangle;
public class PerimeterTraingle {
    public static void main(String[] args){
        System.out.println("Perimeter of a Triangle is " );
        RightAngleTriangle obj1 = new RightAngleTriangle(14,6,7);
        obj1.getPerimeter();
        obj1.showDetails();
    }
}
