import java.util.Scanner;

public class TobinaryString {

    int x;
    int a;
    int b;
    int c;

    public void binaryString(){
        x = 2;
        a = 9;
        b = 17;
        c = 88;
//        Scanner sc = new Scanner(System.in);
        System.out.println("Value of x before left shift: " + Integer.toBinaryString(x));
        System.out.println("Value of x before left shift: " + Integer.toBinaryString(a));
        System.out.println("Value of x before left shift: " + Integer.toBinaryString(b));
        System.out.println("Value of x before left shift: " + Integer.toBinaryString(c));
        x = x << 1;
        a = a << 1;
        b = b << 1;
        c = c << 1;

//        System.out.println("Binary String" + sc.nextInt(x));
//        System.out.println("Binary String" + sc.nextInt(a));
//        System.out.println("Binary String" + sc.nextInt(b));
//        System.out.println("Binary String" + sc.nextInt(c));
//        sc.close();

        System.out.println("Value of x after left shift: " + Integer.toBinaryString(x));
        System.out.println("Value of x after left shift: " + Integer.toBinaryString(a));
        System.out.println("Value of x after left shift: " + Integer.toBinaryString(b));
        System.out.println("Value of x after left shift: " + Integer.toBinaryString(c));
    }
    //excercise 2
    public void binaryString2(){
        x = 150;
        a = 225;
        b = 1555;
        c = 32456;
        System.out.println("befor: " + x + " Value of x after left shift: " + Integer.toBinaryString(x));
        System.out.println("befor: " + a + " Value of a after left shift: " + Integer.toBinaryString(a));
        System.out.println("befor: " + b + " Value of b after left shift: " + Integer.toBinaryString(b));
        System.out.println("befor: " + c + " Value of c after left shift: " + Integer.toBinaryString(c));
//        System.out.println("Value of x before left shift: " + Integer.toBinaryString(x));
//        System.out.println("Value of x before left shift: " + Integer.toBinaryString(a));
//        System.out.println("Value of x before left shift: " + Integer.toBinaryString(b));
//        System.out.println("Value of x before left shift: " + Integer.toBinaryString(c));
        x = x>>2;
        a = a>>2;
        b = b>>2;
        c = c>>2;
        System.out.println("befor: " + x + " Value of x after left shift: " + Integer.toBinaryString(x));
        System.out.println("befor: " + a + " Value of a after left shift: " + Integer.toBinaryString(a));
        System.out.println("befor: " + b + " Value of b after left shift: " + Integer.toBinaryString(b));
        System.out.println("befor: " + c + " Value of c after left shift: " + Integer.toBinaryString(c));
    }
    //excercise 3/4
    public void bitWiseExample(){
        int x = 7;
        int y = 17;
        int z = x & y;
        int a = x | y;

        System.out.println("x (decimal): " + x + ", x (binary): " + Integer.toBinaryString(x));
        System.out.println("y (decimal): " + y + ", y (binary): " + Integer.toBinaryString(y));
        System.out.println("z (decimal): " + z + ", z (binary): " + Integer.toBinaryString(z));
        System.out.println("a (decimal): " + a + ", a (binary): " + Integer.toBinaryString(a));

    }
    //exercise 5
    public void postFix(){
       x = 23;
       System.out.println("Original value of x: " + x);
       x++;
        System.out.println("Value of x (after increment): " + x);

    }
    //exercise 6
    public void postFix2(){
        x = 12;
        System.out.println("Original value of x: " + x);
        x+=1;
        System.out.println("Value of x (after increment): " + x);
        x++;
        System.out.println("Value of x (after increment): " + x);
        x=x+1;
        System.out.println("Value of x (after adding): " + x);

    }
    public void incrementNum(){
        x= 5;
        int y = 8;
        int sum = ++x + y; // x is incremented first, then added to y
        System.out.println(sum);
        x= 5;
        int sums = x++ + y; //x is added to y first, then x is incremented
        System.out.println(sums);
    }

}
