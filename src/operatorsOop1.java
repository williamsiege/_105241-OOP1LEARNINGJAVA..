public class operatorsOop1 {
    public static void main(String[] args) {
        // arithmetic operators example
        int x = 100;
        int y = 50;
        System.out.println(" x+y :" +(x+y) );
        System.out.println(" x-y :" +(x-y) );
        System.out.println(" x/y :" +(x/y) );
        System.out.println(" x*y :" +(x*y) );
        System.out.println(" x%y :" +(x%y) );

        //logical operators examples
        boolean z = true;
        boolean p = false;

        System.out.println(" z&&p :" +(z&&p ) );
        System.out.println(" z||p:" +(z||p ) );
        System.out.println("!(z&&p):" + !(z&&p ) );

        //increment decrement  example.
        int a=4,b=6, c=34, d=12;

        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);

        //Relational operators
        int f=10, g=20;
        System.out.println(f == g);
        System.out.println(f != g);
        System.out.println(f>g);
        System.out.println(f<g );
        System.out.println(f <=g );
        System.out.println(f >= g);

        //assignment operators examples
        int m=10,n=13;
        System.out.println("m+=3 :" +(m+=3));
        System.out.println("m-=11:" +(m-=11));
        System.out.println("n*=8 :" +(n*=8));
        System.out.println("n/=6 :" +(n/=6));


    }
}
