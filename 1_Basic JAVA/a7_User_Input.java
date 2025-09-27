import java.util.*; // if we use asterik then all the code from util package can be used in this code.

public class a7_User_Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);  

        sc.nextLine(); // clear the leftover newline

        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // takes whole line
        System.out.println("Hello, " + name);

        sc.close();
    }
}

// How to run this code on terminal:
// 1. cd "FILE PATH"
// 2. Complile: javac FILE_NAME.java
// 3. Run java FILE_NAME