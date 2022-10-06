import java.util.*;

public class Exercise2 {

    public static void main(String [] args) {
// 2 — Convert Cents to Dollars
// Write a program that takes in an input number of cents. The program will write out the number of dollars and cents, like this:
// Input the cents: 324
// Expected Output :
// The value is 3 dollars and 24 cents.
// Note: Use integer arithmetic and avoid floating point arithmetic.
    int cent = 0;
    int dollars = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Please Enter Number of Cents: ");
    cent = scan.nextInt();
    dollars = (cent / 100);
    int newCent = (cent % 100);
    System.out.print("You have " + dollars + " " + "And " + newCent +" cents");

    scan.close();
    }


}    
