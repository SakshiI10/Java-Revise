// Conditional statements: 
// a. if statement
// b. if-else statement
// c. if-else-if ladder
// d. nested if statement

import java.util.*;

public class a8_conditional_statement {
    public static void main(String[] args) {
        int originalPass = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        int password = sc.nextInt();

        if (password == originalPass) { 
            System.out.print("Your account is open");
        } else {
            System.out.print("Wrong password");
        }
    }
}
