// Conditional statements: 
// a. if statement
// b. if-else statement
// c. if-else-if ladder
// d. nested if statement

import java.util.*;

public class a8_conditional_statement {
    public static void main(String[] args) {
        String originalPass = "sakshi123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String password = sc.nextLine();

        if (password.equals(originalPass)) {
            System.out.println("Your account is open");
        } else {
            System.out.println("Wrong password");
        }

        
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter first number: ");
        int num2=sc.nextInt();
        System.out.print("Which operation: ");
        char op=sc.next().charAt(0);
        
        if(op=='+'){
            int sum=num1+num2;
            System.out.print(num1 + " + " + num2 + " = " + sum);;
        } else if (op=='-'){
            int diff=num1-num2;
            System.out.print(num1 + " - " + num2 + " = " + diff);;
        }
    }
}
