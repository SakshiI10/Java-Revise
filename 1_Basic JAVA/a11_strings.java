// How to create strings:
// a. String Literal: String name="Latif";
// b. new keyword: String name=new String("Latif");

// Strings are immutable.
  
import java.util.*;

public class a11_strings {
    public static void main(String[] args){
        // First way to print string
        // String name="Sakshi";
        // System.out.println(name);
        
        // Second way to print string
        // System.out.println("Sakshi");


        // Escape sequence
        // System.out.println("\'Sakshi\'");
        // System.out.println("\\Sakshi");


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        // String name=sc.next();  // For one word
        String name=sc.nextLine();  // For more than one word
        System.out.println("Entered Name: "+name);
    }
}
