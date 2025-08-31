// In Java, variables are containers that store data in memory. Understanding variables plays a very important role as it defines how data is stored, accessed, and manipulated.

// A variable in Java has three components, which are listed below:

// Data Type: Defines the kind of data stored (e.g., int, String, float).
// Variable Name: A unique identifier following Java naming rules.
// Value: The actual data assigned to the variable.

public class variables {
    public static void main(String[] args)
    {
        int var = 10;
        System.out.println("Local Variable: " + var);

        String message = "Hello, world!";
        System.out.println("Message = " + message);
        
        // To represent constant values, we use the final keyword. Syntax: final dataType CONSTANT_NAME = value; 
        final float PI = 3.14f;
        System.out.println("Value of Pi = " + PI);
    }
}
