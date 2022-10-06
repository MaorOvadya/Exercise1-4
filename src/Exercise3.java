import java.util.*;

public class Exercise3 {
    
    public static void main(String [] args){
        // Write a program that takes a number as input and prints its multiplication table up to 10. Sample Output:
        // Input a number: 9
        // Expected Output :
        // 9 x 1 = 9
        // 9 x 2 = 18
        // 9 x 3 = 27
        // ...9
        // 9 x 10 = 90
        int b = 0;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        b = scan.nextInt();
        for(i = 1; i <= 10; i++) 
        System.out.println(b + " x " + i + " = " +  b * i);
        scan.close();
    }

}
