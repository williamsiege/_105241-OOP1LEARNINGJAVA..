import com.homework.calculationInter;
import com.homework.Rectangle;
public class MainRectangle {
    public static void main(String[] args){
        System.out.println("Interface Exercise for Rectangle");
        calculationInter Rect1 = new Rectangle(14,25);
        Rect1.showDetails();

        System.out.println("Break ////................///");

        Rectangle Rect2 = new Rectangle();
        Rect2.setLength(10);
        Rect2.setWidth(20);
        Rect2.showDetails();
    }
}
