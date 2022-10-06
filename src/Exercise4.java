import java.util.*;

public class Exercise4 {
    
    public static void main(String[]args){

//         4 - Print the Pattern
// Write a program to display the following pattern.
//    J    a   v     v  a
//    J   a a   v   v  a a
// J  J  aaaaa   V V  aaaaa
//  JJ  a     a   V  a     a
 
        System.out.printf("   %-4C%-5c%-5c%-5c%-5c%n", 'J','a','v','v','a');
        System.out.printf("   %-3C%-2c%-5c%-3c%-5c%-2c%-1c%n", 'J','a','a','v','v','a','a');
        System.out.printf("%-3C%-2c%c%c%c%c%-5c%-1C%-5C%c%c%c%c%c%n", 'J','J','a','a','a','a','a','v','v','a','a','a','a','a');
        System.out.printf(" %-1C%-2c%-6c%-4c%-5c%-6c%-4c%n", 'J','J','a','a','v','a','a');

    }
}
