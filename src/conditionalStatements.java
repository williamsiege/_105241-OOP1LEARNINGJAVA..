public class conditionalStatements {
    public static void main(String[] args){

        int i = 10;
        if (i<15){
        System.out.println("10 is less than 15");}

        System.out.println("outside if block");
        // Both statements will be printed.

        // if else statement
      int t = 20;
      if (t <= 18){
          System.out.println("Good Day ");
      } else {
          System.out.println(" Good Evening");
      }

      //if - elseif statements
     int z = 20;
      if (z==10){
          System.out.println("Z is 10");
      } else if (z==15) {
          System.out.println("Z is 15");
      } else if (z==20) {
          System.out.println("Z is 20");
      }else {
          System.out.println("Z is not present");
      }


      // Switch case method
        int day = 4;
        switch (day) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        }


    }
}
