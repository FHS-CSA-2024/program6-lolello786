//import stuff here!
import java.util.Scanner;

//Your code here
class MyClass{
    public static void main(String[]args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter Radius");
        final double pi = 3.14159;
        String radiusInput=myObj.nextLine();
        double radius = Double.valueOf(radiusInput);
        double diameter = radius * 2;
        double circumference = pi * diameter;
        double area = pi * radius * radius;
        System.out.printf("Radius is: " + "%.3f",radius);
        System.out.println();
        System.out.printf("Diameter is: " + "%.3f",diameter);
        System.out.println();
        System.out.printf("Area is: " + "%.3f",area);
        System.out.println();
        System.out.printf("Circumference is: " + "%.3f",circumference);
    }
}
//Paste console output below:
/*
Enter Radius
3.712
Radius is: 3.712
Diameter is: 7.424
Area is: 43.288
Circumference is: 23.323

*/
