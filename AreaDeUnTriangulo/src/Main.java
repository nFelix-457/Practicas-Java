import java.util.Scanner;
/*
* * Author: nFelix-457
* * Date: 16/01/2025
* * Description:  This main class is responsible for generating the logic to obtain the area of a triangle.
* */
public class Main {
    public static void main(String[] args){
        try{
            run();
        }catch (RuntimeException ex){
            System.out.println("unknown error");
        }

    }
    static void run (){
        //Variables
        Triangle triangle = new Triangle();
        Scanner input = new Scanner(System.in);

        // obtain the Base
        double base = readDouble(input, "Enter the base of the triangle: ");
        triangle.setBase(base);

        // obtain the Height
        double height = readDouble(input, "Enter the height of the triangle: ");
        triangle.setHeight(height);


        //obtain the area
        System.out.println("The area of the triangle is: " + triangle.getArea());
    }

    static double readDouble(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (in.hasNextDouble()) {
                return in.nextDouble();
            } else {
                System.out.println("Invalid entry. Must be a number (e.g., 3.5).");
                in.next();
            }
        }
    }

}
