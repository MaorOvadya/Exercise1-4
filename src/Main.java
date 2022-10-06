import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 — Find the Area of a Circle
        //Write a program that takes in a user's input of the radius and calculates the area of a circle. The radius should be read as an integer from the keyboard. Sample of user dialog:
        //Input the radius: 3
        //Expected Output :
        //The radius is: 3 The area is: 28.274333882308138
       // Note: You can use the constant PI from Math.PI.


        Scanner scan = new Scanner(System.in);
        int radius ;
        double area;
        System.out.print("Please Enter Radius: ");
            radius = scan.nextInt();
            area = Math.pow(radius, 2) * Math.PI;
        System.out.print("The Area of the Circle is: " +area);
            scan.close();
    }


}


